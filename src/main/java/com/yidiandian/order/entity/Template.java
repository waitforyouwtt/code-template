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
@ApiModel(description = "Template",value = "Template")
@Data
@Table(name="tb_template")
public class Template implements Serializable{

	@ApiModelProperty(value = "",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

	@ApiModelProperty(value = "模板名称",required = false)
    @Column(name = "name")
	private String name;

	@ApiModelProperty(value = "规格数量",required = false)
    @Column(name = "spec_num")
	private Integer specNum;

	@ApiModelProperty(value = "参数数量",required = false)
    @Column(name = "para_num")
	private Integer paraNum;

}
