package com.lsy.observerModel;

public enum Type {

    Type1(1,"成功");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Type(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }


}
