package com.yidiandian.order.controller;
import com.yidiandian.order.entity.Album;
import com.yidiandian.order.service.AlbumService;
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
@Api(value = "AlbumController")
@RestController
@RequestMapping("/album")
@CrossOrigin
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    /***
     * Album分页条件搜索实现
     * @param album
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "Album条件分页查询",notes = "分页条件查询Album方法详情",tags = {"AlbumController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "Album对象",value = "传入JSON数据",required = false) Album album, @PathVariable  int page, @PathVariable  int size){
        //调用AlbumService实现分页条件查询Album
        PageInfo<Album> pageInfo = albumService.findPage(album, page, size);
        return new Result(true,StatusCodeEnum.OK.getCode(),"查询成功",pageInfo);
    }

    /***
     * Album分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "Album分页查询",notes = "分页查询Album方法详情",tags = {"AlbumController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用AlbumService实现分页查询Album
        PageInfo<Album> pageInfo = albumService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCodeEnum.OK.getCode(),"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param album
     * @return
     */
    @ApiOperation(value = "Album条件查询",notes = "条件查询Album方法详情",tags = {"AlbumController"})
    @PostMapping(value = "/search" )
    public Result<List<Album>> findList(@RequestBody(required = false) @ApiParam(name = "Album对象",value = "传入JSON数据",required = false) Album album){
        //调用AlbumService实现条件查询Album
        List<Album> list = albumService.findList(album);
        return new Result<List<Album>>(true,StatusCodeEnum.OK.getCode(),"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "Album根据ID删除",notes = "根据ID删除Album方法详情",tags = {"AlbumController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用AlbumService实现根据主键删除
        albumService.delete(id);
        return new Result(true,StatusCodeEnum.OK.getCode(),"删除成功");
    }

    /***
     * 修改Album数据
     * @param album
     * @param id
     * @return
     */
    @ApiOperation(value = "Album根据ID修改",notes = "根据ID修改Album方法详情",tags = {"AlbumController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "Album对象",value = "传入JSON数据",required = false) Album album,@PathVariable Integer id){
        //设置主键值
        album.setId(id);
        //调用AlbumService实现修改Album
        albumService.update(album);
        return new Result(true,StatusCodeEnum.OK.getCode(),"修改成功");
    }

    /***
     * 新增Album数据
     * @param album
     * @return
     */
    @ApiOperation(value = "Album添加",notes = "添加Album方法详情",tags = {"AlbumController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "Album对象",value = "传入JSON数据",required = true) Album album){
        //调用AlbumService实现添加Album
        albumService.add(album);
        return new Result(true,StatusCodeEnum.OK.getCode(),"添加成功");
    }

    /***
     * 根据ID查询Album数据
     * @param id
     * @return
     */
    @ApiOperation(value = "Album根据ID查询",notes = "根据ID查询Album方法详情",tags = {"AlbumController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<Album> findById(@PathVariable Integer id){
        //调用AlbumService实现根据主键查询Album
        Album album = albumService.findById(id);
        return new Result<Album>(true,StatusCodeEnum.OK.getCode(),"查询成功",album);
    }

    /***
     * 查询Album全部数据
     * @return
     */
    @ApiOperation(value = "查询所有Album",notes = "查询所Album有方法详情",tags = {"AlbumController"})
    @GetMapping
    public Result<List<Album>> findAll(){
        //调用AlbumService实现查询所有Album
        List<Album> list = albumService.findAll();
        return new Result<List<Album>>(true, StatusCodeEnum.OK.getCode(),"查询成功",list) ;
    }
}
