package com.msr.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/27 10:47
 */
@Data
@NoArgsConstructor
public class Course {

    @TableId
    private Long courseId;
    private String courseName;
    private Long userId;
    private String courseStatus;
}
