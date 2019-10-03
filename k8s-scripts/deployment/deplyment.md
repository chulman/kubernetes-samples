
### yaml 파일 정의해서 생성하기
```bash
 kubectl apply -f simple-my-deployment.yaml --record
```

### revision 조회
```bash
 kubectl rollout history deployment health-check-app
```

### deployment revision 확인
```bash
 kubectl rollout history deployment health-check-app
 kubectl rollout history deployment health-check-app --revision=1

```
### rollback 하기
```bash
kubectl rollout undo deployment health-check-app
kubectl rollout undo deployment health-check-app  --revision=1

```

## deployment 진행 상태 확인
```bash
kubectl rollout status deployment health-check-app
```