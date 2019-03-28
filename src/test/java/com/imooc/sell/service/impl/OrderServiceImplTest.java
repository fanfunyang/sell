package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID="123123";
    @Test
    public void create() {
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerName("杨帆");
        orderDTO.setBuyerAddress("苏州");
        orderDTO.setBuyerPhone("11223344555");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        List<OrderDetail> orderDetails=new ArrayList<>();
        OrderDetail o1=new OrderDetail();
        o1.setProductId("002");
        o1.setProductQuantity(1);
        orderDetails.add(o1);
        OrderDetail o2=new OrderDetail();
        o2.setProductId("003");
        o2.setProductQuantity(2);
        orderDetails.add(o2);
        orderDTO.setOrderDetailList(orderDetails);

        OrderDTO result=orderService.create(orderDTO);
        log.info("创建订单 result={}",result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}