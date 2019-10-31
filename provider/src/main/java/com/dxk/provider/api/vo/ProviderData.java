package com.dxk.provider.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author dengxuekai
 * @Date 2019-08-20 10:27
 */
@Data
public class ProviderData implements Serializable {

    private Integer id;
    private String name;
    private BigDecimal price;

    private List<ProviderData> listObj;

    private List<String> list;

    private Map<String, ProviderData> map;
}
