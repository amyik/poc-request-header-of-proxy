package com.example.targetserver;

import com.example.targetserver.PocDto.PostResponse;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PocController {

  @PostMapping("api/sample-post")
  public PocDto.PostResponse postApi(HttpServletRequest request) {

    log.info("request.getRemoteAddr():{}",request.getRemoteAddr() );

    Enumeration<String> headerNames = request.getHeaderNames();
    while (headerNames.hasMoreElements()) {
      String headerName = headerNames.nextElement();
      String headerValue = request.getHeader(headerName);
      log.info("{}:{}", headerName, headerValue);
    }
    final String message = "works post";
    System.out.println(message);
    return new PostResponse(message);
  }

}
