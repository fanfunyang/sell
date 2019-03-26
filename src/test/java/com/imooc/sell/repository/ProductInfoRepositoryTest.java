package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    ProductInfoRepository repository;
    @Test
    public void saveTest(){
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("001");
        productInfo.setProductName("蛋炒饭");
        productInfo.setProductPrice(new BigDecimal(8.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好吃");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo p=repository.save(productInfo);
        Assert.assertNotNull(p);
    }
    @Test
    public void findByProductStatus() {
        List<ProductInfo> result=repository.findByProductStatus(0);
        Assert.assertNotEquals(0,result.size());
    }
    @Test
    public void findById() {
        ProductInfo productInfo=repository.getOne("001");
        Assert.assertNotNull(productInfo);
    }
}