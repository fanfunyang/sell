package com.imooc.sell.Util;

import com.imooc.sell.vo.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Description TODO
 * Create by fan.yang
 * 2019/2/21 18:40
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
    }
}
