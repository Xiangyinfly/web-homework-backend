package com.hit.webhomework.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName course_emp
 */
@TableName(value ="course_emp")
@Data
public class CourseEmp implements Serializable {
    private String courseId;

    private Integer empId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}