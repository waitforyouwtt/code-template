package ${package_entity};
<#if swagger==true>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
import javax.persistence.*;
import java.io.Serializable;

<#list typeSet as set>
import ${set};
</#list>
/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:12
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
<#if swagger==true>
@ApiModel(description = "${Table}",value = "${Table}")
</#if>
@Table(name="${TableName}")
public class ${Table} implements Serializable{

<#list models as model>
	<#if swagger==true>
	@ApiModelProperty(value = "${model.desc!""}",required = false)
	</#if>
	<#if model.id==true>
	@Id
	<#if model.identity=='YES'>
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	</#if>
	</#if>
    @Column(name = "${model.column}")
	private ${model.simpleType} ${model.name};

</#list>


<#list models as model>
	//get方法
	public ${model.simpleType} get${model.upperName}() {
		return ${model.name};
	}

	//set方法
	public void set${model.upperName}(${model.simpleType} ${model.name}) {
		this.${model.name} = ${model.name};
	}
</#list>


}
