package com.yidiandian.order.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:12
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@ApiModel(description = "Brand",value = "Brand")
@Data
@Table(name="tb_brand")
public class Brand implements Serializable{

	@ApiModelProperty(value = "",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;

	@ApiModelProperty(value = "品牌名称",required = false)
    @Column(name = "name")
	private String name;

	@ApiModelProperty(value = "品牌logo",required = false)
    @Column(name = "image")
	private String image;

	@ApiModelProperty(value = "品牌首字母",required = false)
    @Column(name = "letter")
	private String letter;

	@ApiModelProperty(value = "排序",required = false)
    @Column(name = "seq")
	private Integer seq;

}
