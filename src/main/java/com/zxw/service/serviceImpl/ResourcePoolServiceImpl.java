package com.zxw.service.serviceImpl;

import com.zxw.mapper.ResourcePoolMapper;
import com.zxw.pojo.ResourcePool;
import com.zxw.service.ResourcePoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：ZXW
 * @Date：2024/2/22 9:32
 */

@Service

public class ResourcePoolServiceImpl implements ResourcePoolService {
    @Autowired
    ResourcePoolMapper resourcePoolMapper;


    @Override
    public List<ResourcePool> getAll() {
        return resourcePoolMapper.getAll();
    }

    @Override
    public long add(ResourcePool resourcePool) {
        return resourcePoolMapper.insertSelective(resourcePool);
    }

    @Override
    public ResourcePool getById(long id) {
        return resourcePoolMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(long id) {
         resourcePoolMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(ResourcePool resourcePool) {
        resourcePoolMapper.updateByPrimaryKeySelective(resourcePool);
    }

    @Override
    public List<ResourcePool> getByType(Integer type) {
        return resourcePoolMapper.selectByType(type);
    }

    @Override
    public List getByCreateDate(String Stoday) {
        return resourcePoolMapper.getByCreateDate(Stoday);
    }
    @Override
    public List getByUpdateDate(String Stoday) {
        return resourcePoolMapper.getByUpdateDate(Stoday);
    }
}
