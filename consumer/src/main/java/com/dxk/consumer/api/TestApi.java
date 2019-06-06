package com.dxk.consumer.api;

import com.dxk.consumer.remote.HelloApi;
import com.dxk.consumer.remote.bo.ProviderBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hzdengxuekai
 * @date 2018/12/13 17:28
 */
@Slf4j
@RestController
@RequestMapping("test")
public class TestApi {

	@Resource
	private HelloApi helloApi;

	@GetMapping()
	public String test(String name) {
		return helloApi.hello(name);
	}

	@GetMapping("entity")
	public ProviderBO entity(String name) {
		return helloApi.entity(name);
	}

	@GetMapping("tt")
	public String testt() {
		return "success";
	}
}
