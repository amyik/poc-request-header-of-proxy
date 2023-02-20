package com.example.targetserver;

import lombok.Getter;
import lombok.Setter;

public class PocDto {

  @Getter
  @Setter
  static class PostResponse {
    String message = "works";
    public PostResponse(String message) {
      this.message = message;
    }
  }

}
