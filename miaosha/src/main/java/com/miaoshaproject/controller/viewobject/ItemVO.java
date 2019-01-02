package com.miaoshaproject.controller.viewobject;

import javax.validation.constraints.Min;
import java.math.BigDecimal;

/**
 * @Author: Y_uan
 * @Date: 2019/1/2 16:15
 * @mail: yy494818027@163.com
 */
public class ItemVO {
    private Integer id;

    //商品名称
    private String title;

    //商品价格
    private BigDecimal price;

    //商品的库存
    private Integer stock;

    //商品的描述
    private String description;

    //商品的销量
    private Integer sales;

    //商品描述图片的url
    @NotBlank(message = "商品图片信息不能为空")
    private String imgUrl;
}
