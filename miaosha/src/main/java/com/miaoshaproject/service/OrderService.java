package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Author:Y_uan
 * @Date:2019/1/6 21:15
 * @Mail:yy494818027@163.com
 */
public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount) throws BusinessException;
}
