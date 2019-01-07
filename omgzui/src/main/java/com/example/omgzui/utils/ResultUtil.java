package com.example.omgzui.utils;

import com.example.omgzui.model.Result;

public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(400);
        result.setMsg("成功了");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
