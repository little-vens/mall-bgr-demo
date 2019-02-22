package com.zelda.malldemo.pojo;

import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@ToString
public class Orders {

    private String id;                  // 无意义、主键uuid
    private String orderNum;            // 订单编号 不为空 唯一
    private Date orderTime;             // 下单时间
    private Integer peopleCount;        // 出行人数
    private String orderDesc;           // 订单描述(其它信息)
    private Integer payType;            // 支付方式(0 支付宝 1 微信 2其它
    private Integer orderStatus;        // 订单状态(0 未支付 1 已支付)
    private Product product;            // 产品 一对一
    private Members members;            // 会员 一对一
    private List<Traveller> travellers; // 旅客 一对多


    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }
}
