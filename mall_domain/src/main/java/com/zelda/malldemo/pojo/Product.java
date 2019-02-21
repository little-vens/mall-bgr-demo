package com.zelda.malldemo.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@ToString
@Data
public class Product implements Serializable {
    private String id;
    private String productNum;
    private String productName;
    private String cityName;
}
