package com.zxw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author：ZXW
 * @Date：2024/2/21 17:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Result {
    private Integer code;
    private String msg;
    private Object data;



    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success(){
        return new Result(1,"success",null);
    }

    public static Result success(Object data){
        return new Result(1,"success",data);
    }

//    public static result success(Object data){
//        return new result(1,"success",data);
//    }

//使用http包中的错误代码，


    public static Result error(String msg){
        return new Result(0,"error: "+msg,null);
    }
}
