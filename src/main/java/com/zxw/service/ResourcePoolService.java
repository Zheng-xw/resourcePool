package com.zxw.service;

import com.zxw.pojo.ResourcePool;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：ZXW
 * @Date：2024/2/22 9:30
 */

@Service
public interface ResourcePoolService {
    List<ResourcePool> getAll();

    long add(ResourcePool resourcePool);

    ResourcePool getById(long id);

    void deleteById(long id);

    void update(ResourcePool resourcePool);

    List<ResourcePool> getByType(Integer type);

    List<ResourcePool> getByCreateDate(String Stoday);

    List<ResourcePool> getByUpdateDate(String Stoday);
}
