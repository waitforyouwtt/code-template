package com.yidiandian.order.controller;
import com.yidiandian.order.entity.Brand;
import com.yidiandian.order.service.BrandService;
import com.github.pagehelper.PageInfo;
import com.yunlan.entity.Result;
import com.yunlan.entity.StatusCodeEnum;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:12
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Api(value = "BrandController")
@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;

    /***
     * Brand分页条件搜索实现
     * @param brand
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "Brand条件分页查询",notes = "分页条件查询Brand方法详情",tags = {"BrandController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "Brand对象",value = "传入JSON数据",required = false) Brand brand, @PathVariable  int page, @PathVariable  int size){
        //调用BrandService实现分页条件查询Brand
        PageInfo<Brand> pageInfo = brandService.findPage(brand, page, size);
        return new Result(true,StatusCodeEnum.OK.getCode(),"查询成功",pageInfo);
    }

    /***
     * Brand分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "Brand分页查询",notes = "分页查询Brand方法详情",tags = {"BrandController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用BrandService实现分页查询Brand
        PageInfo<Brand> pageInfo = brandService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCodeEnum.OK.getCode(),"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param brand
     * @return
     */
    @ApiOperation(value = "Brand条件查询",notes = "条件查询Brand方法详情",tags = {"BrandController"})
    @PostMapping(value = "/search" )
    public Result<List<Brand>> findList(@RequestBody(required = false) @ApiParam(name = "Brand对象",value = "传入JSON数据",required = false) Brand brand){
        //调用BrandService实现条件查询Brand
        List<Brand> list = brandService.findList(brand);
        return new Result<List<Brand>>(true,StatusCodeEnum.OK.getCode(),"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "Brand根据ID删除",notes = "根据ID删除Brand方法详情",tags = {"BrandController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用BrandService实现根据主键删除
        brandService.delete(id);
        return new Result(true,StatusCodeEnum.OK.getCode(),"删除成功");
    }

    /***
     * 修改Brand数据
     * @param brand
     * @param id
     * @return
     */
    @ApiOperation(value = "Brand根据ID修改",notes = "根据ID修改Brand方法详情",tags = {"BrandController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "Brand对象",value = "传入JSON数据",required = false) Brand brand,@PathVariable Long id){
        //设置主键值
        brand.setId(id);
        //调用BrandService实现修改Brand
        brandService.update(brand);
        return new Result(true,StatusCodeEnum.OK.getCode(),"修改成功");
    }

    /***
     * 新增Brand数据
     * @param brand
     * @return
     */
    @ApiOperation(value = "Brand添加",notes = "添加Brand方法详情",tags = {"BrandController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "Brand对象",value = "传入JSON数据",required = true) Brand brand){
        //调用BrandService实现添加Brand
        brandService.add(brand);
        return new Result(true,StatusCodeEnum.OK.getCode(),"添加成功");
    }

    /***
     * 根据ID查询Brand数据
     * @param id
     * @return
     */
    @ApiOperation(value = "Brand根据ID查询",notes = "根据ID查询Brand方法详情",tags = {"BrandController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public Result<Brand> findById(@PathVariable Long id){
        //调用BrandService实现根据主键查询Brand
        Brand brand = brandService.findById(id);
        return new Result<Brand>(true,StatusCodeEnum.OK.getCode(),"查询成功",brand);
    }

    /***
     * 查询Brand全部数据
     * @return
     */
    @ApiOperation(value = "查询所有Brand",notes = "查询所Brand有方法详情",tags = {"BrandController"})
    @GetMapping
    public Result<List<Brand>> findAll(){
        //调用BrandService实现查询所有Brand
        List<Brand> list = brandService.findAll();
        return new Result<List<Brand>>(true, StatusCodeEnum.OK.getCode(),"查询成功",list) ;
    }
}
