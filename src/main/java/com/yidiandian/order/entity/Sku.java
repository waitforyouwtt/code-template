package com.yidiandian.order.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.lang.Long;
import java.util.Date;
import java.lang.String;
import java.lang.Integer;
/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:12
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@ApiModel(description = "Sku",value = "Sku")
@Data
@Table(name="tb_sku")
public class Sku implements Serializable{

	@ApiModelProperty(value = "自增主键",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

	@ApiModelProperty(value = "商品条码",required = false)
    @Column(name = "sn")
	private String sn;

	@ApiModelProperty(value = "SKU名称",required = false)
    @Column(name = "name")
	private String name;

	@ApiModelProperty(value = "价格（分）",required = false)
    @Column(name = "price")
	private Long price;

	@ApiModelProperty(value = "库存数量",required = false)
    @Column(name = "num")
	private Long num;

	@ApiModelProperty(value = "库存预警数量",required = false)
    @Column(name = "alert_num")
	private Integer alertNum;

	@ApiModelProperty(value = "商品图片",required = false)
    @Column(name = "image")
	private String image;

	@ApiModelProperty(value = "商品图片列表",required = false)
    @Column(name = "images")
	private String images;

	@ApiModelProperty(value = "重量（克）",required = false)
    @Column(name = "weight")
	private Integer weight;

	@ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "create_time")
	private Date createTime;

	@ApiModelProperty(value = "更新时间",required = false)
    @Column(name = "update_time")
	private Date updateTime;

	@ApiModelProperty(value = "SPU_ID",required = false)
    @Column(name = "spu_id")
	private String spuId;

	@ApiModelProperty(value = "类目ID",required = false)
    @Column(name = "category_id")
	private Integer categoryId;

	@ApiModelProperty(value = "类目名称",required = false)
    @Column(name = "category_name")
	private String categoryName;

	@ApiModelProperty(value = "品牌名称",required = false)
    @Column(name = "brand_name")
	private String brandName;

	@ApiModelProperty(value = "规格",required = false)
    @Column(name = "spec")
	private String spec;

	@ApiModelProperty(value = "销量",required = false)
    @Column(name = "sale_num")
	private Integer saleNum;

	@ApiModelProperty(value = "评论数",required = false)
    @Column(name = "comment_num")
	private Integer commentNum;

	@ApiModelProperty(value = "商品状态 1-正常，2-下架，3-删除",required = false)
    @Column(name = "status")
	private Integer status;

}
