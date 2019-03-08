package com.imooc.sell.vo;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description TODO
 * Create by fan.yang
 * 2019/2/16 10:12
 */
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;

}
