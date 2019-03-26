package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * Create by fan.yang
 * 2019/2/15 13:13
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    //查询在架商品列表
    List<ProductInfo> findUpAll();

    //查询所有商品列表
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOS);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOS);
}
