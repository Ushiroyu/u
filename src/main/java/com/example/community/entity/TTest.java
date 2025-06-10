package com.example.community.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("T_TEST")
public class TTest {
    private String id;
    private String name;
    private int age;
    @TableField(exist = false)
    private String userName;
}
