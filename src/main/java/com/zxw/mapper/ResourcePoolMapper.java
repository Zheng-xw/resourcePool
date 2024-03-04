package com.zxw.mapper;

import com.zxw.pojo.ResourcePool;
import com.zxw.pojo.ResourcePoolExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component

public interface ResourcePoolMapper {
    long countByExample(ResourcePoolExample example);

    int deleteByExample(ResourcePoolExample example);

    void deleteByPrimaryKey(Long id);

    int insert(ResourcePool record);

    long insertSelective(ResourcePool record);

    List<ResourcePool> selectByExample(ResourcePoolExample example);

    ResourcePool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ResourcePool record, @Param("example") ResourcePoolExample example);

    int updateByExample(@Param("record") ResourcePool record, @Param("example") ResourcePoolExample example);

    int updateByPrimaryKeySelective(ResourcePool record);

    int updateByPrimaryKey(ResourcePool record);

    List<ResourcePool> getAll();

    void insertresourcepool(ResourcePool resourcePool);

    List<ResourcePool> selectByType(Integer type);

    List<ResourcePool> getByCreateDate(String Stoday);

    List<ResourcePool> getByUpdateDate(String Stoday);
}