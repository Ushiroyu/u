package com.example.community.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("role")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "ROLE_ID",type = IdType.AUTO)
    private Integer roleId;
    @TableField("NAME")
    private String name;
    @TableField("nameZh")
    private String nameZh;
}
