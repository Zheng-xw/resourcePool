package com.zxw.controller;

import com.zxw.pojo.ResourcePool;
import com.zxw.pojo.Result;
import com.zxw.service.ResourcePoolService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author：ZXW
 * @Date：2024/2/21 16:57
 */

@Slf4j
@RestController
public class ResourcePoolController {

    @RequestMapping("/hello")
    public String Hello(){
        return "HelloSPBT!";
    }
    @Autowired
    ResourcePoolService resourcePoolService;

    @RequestMapping("/getAll")
    public Result getAll(){
//        List<ResourcePool> list=new ArrayList<>();
        //为什么需要建立一个列表？
        log.info("获取资源池全部信息");
        return Result.success(resourcePoolService.getAll());
    }

    /**
     * 待完善
     * 增加数据
     * */
    @PostMapping("/reaourcepoolAdd")
    public Result add(@RequestBody ResourcePool resourcePool){
        log.info("新增资源池数据");
        resourcePoolService.add(resourcePool);
        return Result.success();
    }

    /**
     * 依据ID查询资源池数据信息
     * */
    @GetMapping("/resourcepoolGetById/{id}")
    public Result getById(@PathVariable long id){
        log.info("获取ResourcePoolId:{}",id);
        return Result.success(resourcePoolService.getById(id));
    }


    @GetMapping("/resourcepoolGetByType/{type}")
    public Result getByType(@PathVariable Integer type){
        log.info("获取Type:{}",type);
//        System.out.println(resourcePoolService.getByType(type).get(0));
        return Result.success(resourcePoolService.getByType(type));
    }

    @GetMapping("/time1")
    public String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        return "Current time is: " + now.toString();
    }



    /**
     * 依据ID删除资源池数据信息
     * */
    @RequestMapping("/resourcepoolDelete/{id}")
    public Result deleteById(@PathVariable long id){
        log.info("删除resource, Id:{}",id);
        resourcePoolService.deleteById(id);
        return Result.success();
    }


    /**
     * 依据ID动态更新数据库
     * */
    @PutMapping("/resourcepoolupdate")
    public Result update(@RequestBody ResourcePool resourcePool){
        if(resourcePool.getId()==null){
            return Result.error("primaryKey NULL!");
        }
        else {
            resourcePoolService.update(resourcePool);
            return Result.success(resourcePool);
        }
    }

    @GetMapping("resourcepoolGetByCreateDate")
    public Result getByCreateDate(){
        log.info("查询今日新建数据");
        LocalDate today=LocalDate.now();
        String Stoday=String.valueOf(today);
        return Result.success(resourcePoolService.getByCreateDate(Stoday));

    }
    @GetMapping("resourcepoolGetByUpdateDate")
    public Result getByUpdateDate(){
        log.info("查询今日更新数据");
        LocalDate today=LocalDate.now();
        String Stoday=String.valueOf(today);
        return Result.success(resourcePoolService.getByUpdateDate(Stoday));

    }




}
