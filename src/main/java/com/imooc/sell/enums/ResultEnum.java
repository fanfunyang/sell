package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @ClassName ResultEnum
 * @Description TODO
 * Create by fan.yang
 * 2019/3/25 15:21
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不足")
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
