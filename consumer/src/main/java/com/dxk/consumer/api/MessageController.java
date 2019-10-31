package com.dxk.consumer.api;

import com.dxk.cloud.demo.message.common.param.SendMessageParam;
import com.dxk.cloud.demo.message.common.result.SendMessageResult;
import com.dxk.consumer.remote.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dengxuekai
 * @Date 2019-10-31 13:00
 */
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("send")
    public SendMessageResult send(SendMessageParam param) {
        return messageService.sendMessage(param);
    }
}
