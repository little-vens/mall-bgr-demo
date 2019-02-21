package com.zelda.malldemo.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@ToString
@Data
public class Product implements Serializable {
    private String id;                  // 主键
    private String productNum;          // 产品序号
    private String productName;         // 产品名称
    private String cityName;            // 城市名称
    private Date DepartureTime;         // 出发时间
    private Double productPrice;        // 产品价格
    private String productDesc;         // 产品描述
    private Integer productStatus;      // 产品状态
}
