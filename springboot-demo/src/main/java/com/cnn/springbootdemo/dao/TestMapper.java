/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.springbootdemo.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.cnn.springbootdemo.po.Hello;

/**
 * @author Administrator
 * @date 2020/4/1
 */
@Repository
public interface TestMapper {
    @Select("select * from hello where id=#{id}")
    Hello selectById(int id);
}
