package com.imooc.sell.Util;

import java.util.Random;

/**
 * @ClassName KeyUtil
 * @Description TODO
 * Create by fan.yang
 * 2019/3/26 8:55
 */
public class KeyUtil {
    //生成唯一主键
    public static synchronized String genUniqueKey(){
        Random random=new Random();
        Integer number=random.nextInt(900000)+100000;
        //toString()当对象为空值是会抛出空指针异常
//        return System.currentTimeMillis()+number.toString();
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
