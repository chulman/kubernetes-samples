 # Secret

-  보안유지가 필요한 자격증명 및 개인 암호화 키 같은 중요한 정보를 저장하고 분류하기 위해 제공되는 리소스

##    1)  특징
    - 패스워드 같은 기밀 정보를 Base64 인코딩으로 만들 수 있다
    - key=value 쌍으로 사용
    - 환경 변수로 secret entry를 컨테이너에 전달할 수 있다.
    - 볼륨의 파일로서 시크릿 엔트리를 노출할 수 있다

##    2) 종류
    Built in 시크릿(default-token secret)
    : 클러스터 내부에서 API 이용 시 사용됨
    : Service account를 생성하면 자동으로 secret 생성
    : 만들어진 secret으로 해당 service account가 권한을 가지고 있는 API 접근 가능


    사용자 정의 시크릿
    : 말그대로 사용자가 정의한 시크릿
    : create 명령어를 사용하여 생성할 수 있고, yaml 파일에 정의해서 생성할 수도 있음

##  3) Secret vs ConfigMap
    민감하지 않은 일반 데이터는 configMap
    중요 데이터가 포함되어 있으면 Secret 리소스를 사용하는 것이 좋다.

##   4)  Built in Secret
    : 모든 Pod에는 자동으로 연결된 secret 볼륨이 존재함

    $ kubectl describe po [name]

        
        
```bash
  Mounts:
    /var/run/secrets/kubernetes.io/serviceaccount from default-token-kf7wl (ro)

    ---------------------------
  Volumes:
    default-token-kf7wl:
      Type:        Secret (a volume populated by a Secret)
      SecretName:  default-token-kf7wl
      Optional:    false

```           













