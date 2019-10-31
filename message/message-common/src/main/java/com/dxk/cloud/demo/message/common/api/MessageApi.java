package com.dxk.cloud.demo.message.common.api;

import com.dxk.cloud.demo.message.common.param.SendMessageParam;
import com.dxk.cloud.demo.message.common.result.SendMessageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author dengxuekai
 * @Date 2019-10-31 12:13
 */
public interface MessageApi {

    @RequestMapping(value = "send", method = RequestMethod.GET)
    SendMessageResult sendMessage(@RequestBody SendMessageParam param);
}
