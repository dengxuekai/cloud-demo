package com.dxk.consumer.remote;

import com.dxk.consumer.remote.bo.ProviderBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hzdengxuekai
 * @date 2018/12/13 17:32
 */
@FeignClient(name = "provider")
public interface HelloApi {

	@GetMapping("hello")
	String hello(@RequestParam("name") String name);

	@GetMapping("hello/entity")
	ProviderBO entity(@RequestParam("name") String name);
}
