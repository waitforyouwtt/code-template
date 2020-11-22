package com.yidiandian.order.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.lang.String;
import java.lang.Integer;
/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:12
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@ApiModel(description = "Spec",value = "Spec")
@Data
@Table(name="tb_spec")
public class Spec implements Serializable{

	@ApiModelProperty(value = "自增主键",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

	@ApiModelProperty(value = "名称",required = false)
    @Column(name = "name")
	private String name;

	@ApiModelProperty(value = "规格选项",required = false)
    @Column(name = "options")
	private String options;

	@ApiModelProperty(value = "排序",required = false)
    @Column(name = "seq")
	private Integer seq;

	@ApiModelProperty(value = "模板ID",required = false)
    @Column(name = "template_id")
	private Integer templateId;

}
