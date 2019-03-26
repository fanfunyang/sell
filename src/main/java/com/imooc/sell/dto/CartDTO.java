package com.imooc.sell.dto;

import lombok.Data;

/**
 * @ClassName CartDTO
 * @Description TODO
 * Create by fan.yang
 * 2019/3/26 17:01
 */
@Data
public class CartDTO {
    //商品id
    private String productId;

    //数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
