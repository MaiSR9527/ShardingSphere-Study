package com.msr.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msr.shardingjdbc.entity.Course;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/27 10:46
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}
