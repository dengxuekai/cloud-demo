package com.dxk.provider.api;

import com.dxk.provider.api.vo.ProviderBO;
import com.dxk.provider.handler.Handler;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author hzdengxuekai
 * @date 2018/12/13 17:05
 */
@Slf4j
@RestController
@RequestMapping("hello")
public class HelloApi {

	@Value("${version}")
	String apiVersion;
//    @Value("${spring.profiles.active}")
//    String profile;

	@Autowired
	private List<Handler> handlers;

	@GetMapping()
	public String hello(String name) {
		log.info("here cloud request comes, name:{}", name);
		return "Hello " + name + "!";
	}

	@GetMapping("entity")
	public ProviderBO call(String name) {
		return new ProviderBO(UUID.randomUUID().toString(), name.length());

	}

	@GetMapping("config")
	public String testConfig() {
		return apiVersion;
	}

	@GetMapping("handler")
	public void handle() {
		handlers.forEach(Handler::handle);
	}

//	@GetMapping("profile")
//    public String profile() {
//	    return profile;
//    }
}
