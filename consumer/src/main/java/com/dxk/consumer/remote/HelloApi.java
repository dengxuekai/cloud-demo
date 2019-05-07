package com.dxk.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hzdengxuekai
 * @date 2018/12/13 17:32
 */
@FeignClient(name = "provider")
public interface HelloApi {

	@GetMapping("provider/hello")
	String hello(@RequestParam("name") String name);
}
