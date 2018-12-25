package com.miaoshaproject.error;

/**
 * @Author: Y_uan
 * @Date: 2018/12/25 9:09
 * @mail: yy494818027@163.com
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
