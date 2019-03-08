package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ProductInfo
 * @Description 商品
 * Create by fan.yang
 * 2019/2/15 9:13
 */
@Entity
//@Proxy(lazy = false)
//@DynamicUpdate
@Data
public class ProductInfo {
    @Id
    private String productId;

    //名字
    private String productName;

    //单价
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //小图
    private String productIcon;

    //商品状态,0正常1下架
    private Integer productStatus;

    //类目编号
    private Integer categoryType;

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;
}
