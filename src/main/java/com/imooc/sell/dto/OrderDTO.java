package com.imooc.sell.dto;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderDTO
 * @Description TODO
 * Create by fan.yang
 * 2019/3/25 14:50
 */
@Data
public class OrderDTO {
    //订单id
    private String orderId;

    //买家名字
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信openid
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态, 默认为0新下单
    private Integer orderStatus;

    //支付状态, 默认为0等待支付
    private Integer payStatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    //订单详情
    private List<OrderDetail> orderDetailList;
}
