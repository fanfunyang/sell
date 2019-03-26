package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @ClassName OrderStatusEnum
 * @Description TODO
 * Create by fan.yang
 * 2019/3/25 9:37
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISH(1,"完结"),
    CANCEL(2,"已取消"),
    ;
    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
