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
@ApiModel(description = "Album",value = "Album")
@Data
@Table(name="tb_album")
public class Album implements Serializable{

	@ApiModelProperty(value = "自增主键",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

	@ApiModelProperty(value = "相册名称",required = false)
    @Column(name = "title")
	private String title;

	@ApiModelProperty(value = "相册封面",required = false)
    @Column(name = "image")
	private String image;

	@ApiModelProperty(value = "图片列表",required = false)
    @Column(name = "image_items")
	private String imageItems;

}
