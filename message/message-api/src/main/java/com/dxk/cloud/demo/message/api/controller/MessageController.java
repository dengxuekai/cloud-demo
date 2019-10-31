package com.dxk.cloud.demo.message.api.controller;

import com.dxk.cloud.demo.message.common.api.MessageApi;
import com.dxk.cloud.demo.message.common.param.SendMessageParam;
import com.dxk.cloud.demo.message.common.result.SendMessageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dengxuekai
 * @Date 2019-10-31 12:47
 */
@Slf4j
@RestController
public class MessageController implements MessageApi {

    @Override
    public SendMessageResult sendMessage(SendMessageParam param) {
        log.info("发送消息, 用户:{}, 内容:{}", param.getNumber(), param.getContent());
        SendMessageResult result = new SendMessageResult();
        result.setNumber(param.getNumber());
        result.setSendStatus(true);
        return result;
    }

    @GetMapping("test")
    public String test(SendMessageParam param) {
        log.info("param:{}", param.getNumber());
        return "success";
    }
}
