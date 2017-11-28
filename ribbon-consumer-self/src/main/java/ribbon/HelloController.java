package ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ribbon.feign.HelloServiceFign;

@RestController
public class HelloController {
     @Autowired
     HelloServiceFign helloServiceFign;
     
     @RequestMapping("/hello")
     public String hello(){
    	 return helloServiceFign.hello("二号首长");
     }
     
}
