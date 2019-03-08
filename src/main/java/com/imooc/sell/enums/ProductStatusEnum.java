package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @ClassName ProductStatusEnum
 * @Description 商品状态
 * Create by fan.yang
 * 2019/2/15 13:21
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
