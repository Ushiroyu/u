package com.xj.groupbuy.common.vo;

import lombok.Data;

@Data
public class CommonVO {

    //交易成功失败表示
    private boolean success;
    // 状态码
    private Integer status;
    //交易结果描述
    private String msg;
    //返回数据
    private Object data;

    public CommonVO() {
    }

    public CommonVO(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public CommonVO(boolean success, String msg, Object data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public CommonVO(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public CommonVO(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public static CommonVO ok(String msg) {
        return new CommonVO(200, msg, null);
    }

    public static CommonVO ok(String msg, Object data) {
        return new CommonVO(200, msg, data);
    }

    public static CommonVO error(String msg) {
        return new CommonVO(500, msg, null);
    }

    public static CommonVO error(String msg, Object data) {
        return new CommonVO(500, msg, data);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
