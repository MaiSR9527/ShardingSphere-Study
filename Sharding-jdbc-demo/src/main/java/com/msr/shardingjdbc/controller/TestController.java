package com.msr.shardingjdbc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.msr.shardingjdbc.entity.Course;
import com.msr.shardingjdbc.entity.Order;
import com.msr.shardingjdbc.entity.Production;
import com.msr.shardingjdbc.mapper.CourseMapper;
import com.msr.shardingjdbc.mapper.OrderMapper;
import com.msr.shardingjdbc.mapper.ProductionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/27 11:51
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ProductionMapper productionMapper;


    @PostMapping("add")
    public String add(@RequestBody Course course) {
        int insert = courseMapper.insert(course);
        return insert == 0 ? "添加失败" : "添加成功";
    }

    @GetMapping("query/{id}")
    public Course queryById(@PathVariable Long id) {
        return courseMapper.selectById(id);
    }

    @GetMapping("query/{uid}/{cid}")
    public Course query(@PathVariable("uid") Long uid, @PathVariable("cid") Long cid) {
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(uid != null, Course::getUserId, uid)
                .eq(cid != null, Course::getCourseId, cid);
        return courseMapper.selectOne(queryWrapper);
    }

    @PostMapping("add2")
    public String add2(@RequestBody Order order) {
        order.setCreateTime(new Date());
        int insert = orderMapper.insert(order);
        return insert == 0 ? "添加失败" : "添加成功";
    }

    @GetMapping("order/{id}")
    public Order getOrder(@PathVariable("id")Long id){
        return orderMapper.selectById(id);
    }

    @PostMapping("add3")
    public String add3(@RequestBody Production production) {
        int insert = productionMapper.insert(production);
        return insert == 0 ? "添加失败" : "添加成功";
    }
}
