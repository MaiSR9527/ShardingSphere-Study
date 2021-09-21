package com.msr.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msr.shardingjdbc.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/27 18:37
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
