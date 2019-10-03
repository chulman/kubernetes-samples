## ingress-nginx 설치

```bash
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/master/deploy/static/mandatory.yaml
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/master/deploy/static/provider/cloud-generic.yaml

or 

kubectl apply -f ingress-nginx.yaml

```

## get resouce
```bash
kubectl -n ingress-nginx get svc,po
```


## svc, ingress 시작
```bash
Kubectl apply -f simple-svc.yaml
Kubectl apply -f simple-ingress.yaml
```

## ingress get
```bash
kubectl get ingress
```

## test
```bash
curl http://localhost -H 'Host: com.k8s.myapp'
```