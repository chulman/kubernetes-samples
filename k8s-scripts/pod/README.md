
### yaml 파일 정의해서 생성하기
```bash
 kubectl apply -f simple-my-pod.yaml
```


### pod 정보 조회

```bash
 kubectl get pod
 kubectl get pods --all-namespaces -o wide
```

### pod 내부 컨테이너 실행
```bash
 kubectl exec -it health-check-app sh -c health-app

```

### 로그 보기
```bash
kubectl logs [pod name]
```
 
### 배포 정보 보기
```bash
kubectl get deployments
```

### pod 삭제
```bash
kubectl delete pod [pod name]
```

### 리소스 전체 삭제
```bash
kubectl delete -f simple-my-pod.yaml
```

### 로컬 포트 포워딩
```bash
kubectl port-forward health-check-app 8080:8080 
```

