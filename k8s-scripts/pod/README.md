
### yaml 파일 정의해서 생성하기
> kubectl apply -f simple-pod.yaml


### 샘플 앱 실행하기
> kubectl run k8s-health-app --image=k8s-my-app:latest --port=8080 ‐‐generator=run/v1

### pod 정보 조회

> kubectl get pod

### 로그 보기
> kubectl logs [pod name]
 
### 배포 정보 보기
> kubectl get deployments 

### pod 삭제
> kubectl delete pod [pod name] 

### 리소스 전체 삭제
> kubectl delete -f simple-pod.yaml 