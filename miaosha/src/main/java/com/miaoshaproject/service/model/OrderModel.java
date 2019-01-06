package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * @Author:Y_uan
 * @Date:2019/1/621:01
 * @Mail:yy494818027@163.com
 */
//用户下单的交易模型
public class OrderModel {
    private String id;  //交易号，一般企业级的订单号要有明确属性（日期等）

    //购买用户的id
    private Integer userId;

    //购买商品的单价
    private BigDecimal itemPrice;

    //购买商品id
    private Integer itemId;

    //购买数量
    private Integer amount;

    //购买金额
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
}
