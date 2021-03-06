package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory=repository.findById(1).get();
        System.out.println(productCategory.toString());
    }
    @Test
    public void saveOneTest(){
        ProductCategory productCategory=repository.findById(2).get();
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
    @Test
    @Transactional
    public void saveOneTest2(){
        ProductCategory productCategory=new ProductCategory("女生最爱",5);
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotNull(result);
        //和上面功能一样
        //Assert.assertNotEquals(null,result);
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list= Arrays.asList(1,2,3);
        List<ProductCategory> result=repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}