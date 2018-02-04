package com.lm.datainput.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * abstract 抽象类、方法，必须被继承才能使用，不可生成对象
 * @description 通用Service
 * @author&date Created by louiemain on 2018/2/3 19:57
 */
public class BaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    /**
     * @description 获取所有
     * @author louiemain
     * @date Created on 2018/2/3 20:02
     * @param
     * @return java.util.List<T>
     */
    public List<T> getAll() {
        return this.mapper.selectAll();
    }

    public int save(T entity) {
        return this.mapper.insert(entity);
    }
}
