package com.dxk.consumer.remote;

import com.dxk.cloud.demo.message.common.api.MessageApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author dengxuekai
 * @Date 2019-10-31 12:58
 */
@FeignClient(name = "message")
public interface MessageService extends MessageApi {
}
