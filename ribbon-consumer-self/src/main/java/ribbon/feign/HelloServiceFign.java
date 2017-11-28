package ribbon.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import service.HelloService;

@FeignClient("hello-service")
public interface HelloServiceFign extends HelloService{
      
}
