package com.msr.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/27 18:34
 */
@Data
@TableName("t_production")
public class Production {

    @TableId
    private Long pid;
    private String pname;
    private Integer price;
}
