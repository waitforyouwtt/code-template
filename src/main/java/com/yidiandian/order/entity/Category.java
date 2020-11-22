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
@ApiModel(description = "Category",value = "Category")
@Data
@Table(name="tb_category")
public class Category implements Serializable{

	@ApiModelProperty(value = "自增主键",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

	@ApiModelProperty(value = "分类名称",required = false)
    @Column(name = "name")
	private String name;

	@ApiModelProperty(value = "商品数量",required = false)
    @Column(name = "goods_num")
	private Long goodsNum;

	@ApiModelProperty(value = "是否显示",required = false)
    @Column(name = "is_show")
	private String isShow;

	@ApiModelProperty(value = "是否导航",required = false)
    @Column(name = "is_menu")
	private String isMenu;

	@ApiModelProperty(value = "排序",required = false)
    @Column(name = "seq")
	private Integer seq;

	@ApiModelProperty(value = "上级ID",required = false)
    @Column(name = "parent_id")
	private Integer parentId;

	@ApiModelProperty(value = "模板ID",required = false)
    @Column(name = "template_id")
	private Integer templateId;

}
