## service 

-  pod의 집합(주로 rs)에 대한 서비스 디스커버리를 제공하는 리소스
-  service의 대상이 되는 pod는 label selector로 정해진다.

### service type 4가지가 존재
- cluster IP : cluster IP 생성
- Node Port : cluster IP 생성 및 global port 개방
- load Balancer : 로컬 환경에서는 사용 할 수 없음. 주로 클라우드 플랫폼에서 사용
- external name : 셀렉터 및 포트 정의 하지 않음. externalName만으로 접근


### yaml 파일 정의해서 생성하기
```bash
 kubectl apply -f nodeport-service.yaml
```

### service 조회
```bash
 kubectl get svc
```

### test
```bash
 curl http://localhost:[port]  
```