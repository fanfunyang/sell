package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @ClassName PayStatusEnum
 * @Description TODO
 * Create by fan.yang
 * 2019/3/25 9:42
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
