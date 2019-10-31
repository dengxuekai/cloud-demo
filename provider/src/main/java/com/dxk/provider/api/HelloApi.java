package com.dxk.provider.api;

import com.dxk.provider.api.vo.ProviderBO;
import com.dxk.provider.api.vo.ProviderData;
import com.dxk.provider.handler.Handler;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.ReactiveGeoCommands;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisGeoCommands;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.JedisCommands;

import java.math.BigDecimal;
import java.util.*;

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
//	@Autowired
//	private RedisTemplate redisTemplate;

    @Autowired
    private List<Handler> handlers;

    @GetMapping()
    public String hello(String name) {
        log.info("here cloud request comes, name:{}", name);
        return "Hello " + name + "!";
    }

    @GetMapping("entity")
    public ProviderBO call(String name) {
//		redisTemplate.execute((RedisCallback) redisConnection -> {
//			JedisCommands commands = (JedisCommands) redisConnection.getNativeConnection();
//			return commands.set("key", "1", "NX", "EX", 10);
//		});
//        ProviderBO providerBO = new ProviderBO();
//        providerBO.setAge(name.length());
//        providerBO.setName(name);
//        providerBO.setList(Arrays.asList("ss", "aa"));
//
//        List<ProviderData> data = new ArrayList<>();
//        ProviderData data1 = new ProviderData();
//        data1.setId(1);
//        data1.setName("name");
//        data1.setPrice(BigDecimal.TEN);
//        data.add(data1);
//        providerBO.setListObj(data);
//
//        Map<String, ProviderData> map = new HashMap<>();
//        map.put(data1.getName(), data1);
//        providerBO.setMap(map);
//
//        ProviderData data2 = new ProviderData();
//        BeanUtils.copyProperties(data1, data2);
//
//        data1.setListObj(Collections.singletonList(data2));
//
//        Map<String, ProviderData> map2 = new HashMap<>();
//        map2.put(data2.getName(), data2);
//
//        data1.setMap(map2);
		return null;
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
