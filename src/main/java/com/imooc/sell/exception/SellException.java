package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * @ClassName SellException
 * @Description TODO
 * Create by fan.yang
 * 2019/3/25 15:20
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }
}
