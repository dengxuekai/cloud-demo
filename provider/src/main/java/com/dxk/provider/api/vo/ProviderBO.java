package com.dxk.provider.api.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Author dengxuekai
 * @Date 2019-05-23 16:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProviderBO implements Serializable {

    private String name;
    private Integer age;

    private List<ProviderData> listObj;

    private List<String> list;

    private Map<String, ProviderData> map;
}
