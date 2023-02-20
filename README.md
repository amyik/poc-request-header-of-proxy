
### 실행하기

- `kubectl` 이 가능한 환경 필요
- `skaffold` 설치 https://skaffold.dev/docs/install/#standalone-binary
- 아래 명령으로 http-client, nginx proxy 2개, target-server 를 실행
- `ctrl + c` 통해 실행 종료 및 자원 삭제
```shell
skaffold dev
```

### http 요청 생성 하기
- 아래 명령으로 http-client shell에 진입 후, http 요청을 생성
- 요청 경로 : http-client -> nginx proxy1 -> nginx proxy2 -> target-server
```shell
kubectl exec -it http-client -- sh
curl -X POST http://nginx1:8080/api/sample-post
```
- target-server의 log에서 요청의 헤더 값을 확인한다.



