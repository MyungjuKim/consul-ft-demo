# consul-ft-demo

## Consul 설치 및 실행

* https://learn.hashicorp.com/tutorials/consul/get-started-install (설치 참고)
* $ consul agent -dev

## K/V 등록
1. http://localhost:8500 > 'Key/Value' > 'Create'
2. Key/Value 등록 > 'Save'
* Key or folder
```
config/demo/feature-toggles.yml
```
* Value
```
feature:
  api:
    order:
      enabled: true
    readside:
      enabled: true 
```

## Project Build & Run (Java 11 설치 필요)
* $ ./mvnw clean
* $ ./mvnw install
* $ java -jar target/consul-ft-demo-0.0.1-SNAPSHOT.jar

## API 접속
* http://localhost:8080/api/order
* http://localhost:8080/api/order/state
