package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/hs2")
public interface HelloService {
	
	@GetMapping("/hello1")
	String hello(@RequestParam("name") String name);

}
