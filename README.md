                                       Request Flow                                  
                                                                                     
     ,-------------.          ,---------.          ,---------.          ,-----------.
     |= Http Client|          |= Proxy1 |          |= Proxy2 |          |= Server   |
     |10.0.1.50    |          |10.0.1.51|          |10.0.1.52|          |  10.0.1.53|
     `------+------'          `----+----'          `----+----'          `-----+-----'
            |    HTTP Request      |                    |                     |      
            |--------------------->|                    |                     |      
            |                      |                    |                     |      
            |                      |  Forward Request   |                     |      
            |                      |------------------->|                     |      
            |                      |                    |                     |      
            |                      |                    |  Forward Request    |      
            |                      |                    |-------------------->|      
            |                      |                    |                     |      
            |                      |                    |   HTTP Response     |      
            |                      |                    |<- - - - - - - - - - |      
            |                      |                    |                     |      
            |                      | Forward Response   |                     |      
            |                      |<- - - - - - - - - -|                     |      
            |                      |                    |                     |      
            |    HTTP Response     |                    |                     |      
            |<- - - - - - - - - - -|                    |                     |      
            |                      |                    |                     |      
            |                      |                    |                     |      

### ????????????

- `kubectl` ??? ????????? ?????? ??????
- `skaffold` ?????? https://skaffold.dev/docs/install/#standalone-binary
- ?????? ???????????? http-client, nginx proxy 2???, target-server ??? ??????
- `ctrl + c` ?????? ?????? ?????? ??? ?????? ??????
```shell
skaffold dev
```

### http ?????? ?????? ??????
- ?????? ???????????? http-client shell??? ?????? ???, http ????????? ??????
- ?????? ?????? : http-client -> nginx proxy1 -> nginx proxy2 -> target-server
```shell
kubectl exec -it http-client -- sh
curl -X POST http://nginx1:8080/api/sample-post
```
- target-server??? log?????? ????????? ?????? ?????? ????????????.



