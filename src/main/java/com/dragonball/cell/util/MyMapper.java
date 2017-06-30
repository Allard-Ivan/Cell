package com.dragonball.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Allard
 * Created by dw on 2017/6/26.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
