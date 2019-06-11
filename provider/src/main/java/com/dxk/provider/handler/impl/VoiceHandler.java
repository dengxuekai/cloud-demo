package com.dxk.provider.handler.impl;

import com.dxk.provider.handler.Handler;
import org.springframework.stereotype.Service;

/**
 * @Author dengxuekai
 * @Date 2019-06-08 14:27
 */
@Service
public class VoiceHandler implements Handler {

    @Override
    public void handle() {
        System.out.println("VoiceHandler");
    }
}
