package com.msr.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/27 18:32
 */
@Data
@TableName("t_order")
public class Order {

    @TableId
    private Long orderId;
    private String orderName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
