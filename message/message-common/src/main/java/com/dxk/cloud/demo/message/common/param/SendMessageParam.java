package com.dxk.cloud.demo.message.common.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author dengxuekai
 * @Date 2019-10-31 12:10
 */
@Data
public class SendMessageParam implements Serializable {

    private String number;

    private String content;
}
