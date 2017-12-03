## 配置注册中心
配置注册中心非常简单在启动的Application类上打上注解@EanbleEurekaServer
就完成了注册中心配置。但在启动之后，每一段时间就会报错。原因是EurekaServer既
可以是注册中心，同时也是一个应用，能够把自己注册到别的注册中心里，这样来完成高可用。
如果只是想配置一个单点的注册中心，则需要在Application.yml中进行如下配置
```
eureka:
  client:
    register-with-eureka: false//不向其它注册中心注册自己
    fetch-registry: false//不向其它注册中心拉取应该信息
```