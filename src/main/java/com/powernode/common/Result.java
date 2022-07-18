package com.powernode.common;

/**
 * 描述:
 * 作者: Mr.T
 * 时间: 2022-06-27 16:42
 */
public class Result {


    /**
     *  业务码 如果为 0 则表示业务正常 其他值表示不正常
     */
    Integer code = 0;
    /**
     * 业务消息
     */
    String msg = "操作成功!";
    /**
     * 业务数据
     */
    Object data;

    /**
     *  默认 操作成功 没有返回数据
     */
    public Result(){}

    /**
     * 操作成功 存在返回数据
     * @param data
     */
    public Result(Object data){
        this.data = data;
    }

    /**
     * 操作不成功
     * @param code 错误码
     * @param msg  错误消息
     */
    public Result(Integer code, String msg){
        this.code = code;
        this.msg = msg;
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
