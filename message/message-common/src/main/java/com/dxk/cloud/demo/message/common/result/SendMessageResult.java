package com.dxk.cloud.demo.message.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author dengxuekai
 * @Date 2019-10-31 12:12
 */
@Data
public class SendMessageResult implements Serializable {

    private String number;

    private Boolean sendStatus;
}
