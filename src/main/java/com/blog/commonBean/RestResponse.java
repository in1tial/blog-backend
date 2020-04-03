package com.blog.commonBean;
/**
 *  公共的Restful bean
 *  @author lijunwei
 *  
 */ 
public class RestResponse {
    private Integer code = 400;
    private String msg;
    private Object data;

    // 不传递参数则生成200，成功响应体
    public RestResponse(){
        this.code = 200;
        this.msg = "Success";
        this.data = null;
    }

    // 不传递参数则生成200，成功响应体
    public RestResponse(String msg){
        this.code = 400;
        this.msg = msg;
        this.data = null;
    }

    // 只传递data，生成成功响应体
    public RestResponse(Object data){
        this.code = 200;
        this.msg = "Success";
        this.data = data;
    } 

    // 根据code msg 生成没有data的响应体
    public RestResponse(Integer code, String msg){
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    // 根据code msg data 生成响应体
    public RestResponse(Integer code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
}