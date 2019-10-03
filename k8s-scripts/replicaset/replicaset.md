
### yaml 파일 정의해서 생성하기
```bash
 kubectl apply -f simple-my-replica.yaml
```

### label 조회
```bash
 - kubectl get pods --show-labels
```

### selector의 라벨을 통해 pods 조회
```bash
kubectl get pod -l app=healthcheck-test
```
 
### replicatset 삭제
```bash
kubectl delete rs health-check-app --cascade=false 
```
