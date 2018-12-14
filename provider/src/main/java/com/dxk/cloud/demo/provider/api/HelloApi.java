package com.dxk.cloud.demo.provider.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author hzdengxuekai
 * @date 2018/12/13 17:05
 */
@Slf4j
@RestController
@RequestMapping("hello")
public class HelloApi {

	@GetMapping()
	public String hello(String name) {
		log.info("here cloud request comes, name:{}", name);
		return "Hello " + name + "!";
	}
}
