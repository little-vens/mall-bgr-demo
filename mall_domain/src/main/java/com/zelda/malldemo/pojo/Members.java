package com.zelda.malldemo.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@ToString
public class Members {

    private String id;                  // 主键id,无意义
    private String name;                // 会员姓名
    private String phoneNum;            // 会员手机号码
    private String email;               // 会员邮箱
    private List<Orders> ordersList;    // 会员的订单集合

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }
}
