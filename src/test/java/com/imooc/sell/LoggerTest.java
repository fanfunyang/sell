package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    //private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        log.debug("debug....");
        log.info("info....");
        log.error("error....");
        String name="yf";
        String msg="666";
        log.info("name:{}{}{}",name,msg,msg);
    }
    @Test
    public void ttt(){
        int array[] = {3,4,4,3,2};
        int v = 0;
        for(int i=0;i<array.length;i++){
            v^=array[i];
            System.out.println(v);
        }
        System.out.println("不相同的那个数是："+v);
    }
}
