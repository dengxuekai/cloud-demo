package com.dxk.provider.handler.impl;

import com.dxk.provider.handler.Handler;
import org.springframework.stereotype.Service;

/**
 * @Author dengxuekai
 * @Date 2019-06-08 14:26
 */
@Service
public class ImageHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("ImageHandler");
    }
}
