## 分类
返回哪些对象会被视为异步处理请求
```
ListenableFutureReturnValueHandler (org.springframework.web.servlet.mvc.method.annotation)
SingleReturnValueHandler (org.springframework.cloud.netflix.rx)
DeferredResultMethodReturnValueHandler (org.springframework.web.servlet.mvc.method.annotation)
CallableMethodReturnValueHandler (org.springframework.web.servlet.mvc.method.annotation)
ResponseBodyEmitterReturnValueHandler (org.springframework.web.servlet.mvc.method.annotation)
CompletionStageReturnValueHandler (org.springframework.web.servlet.mvc.method.annotation)
AsyncTaskMethodReturnValueHandler (org.springframework.web.servlet.mvc.method.annotation)
```


### AsyncTask
提供异步任务Task，可对执行流程进行自定义
#### CallableMethodReturnValueHandler
返回Callable对象，Callable会自动被丢入到线程池中执行。Callable的处理会丢到一个固定的线程中进行处理。

### DeferredResult

## 问题
使用Spring mvc Test进行Spring的测试

实现可能是同步，也可能不是同步的调用执行




