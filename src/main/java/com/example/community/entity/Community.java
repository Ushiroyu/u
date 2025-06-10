package com.example.community.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("COMMUNITY")
public class Community implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer id;
    @TableField("STREET_CODE")
    private Long streetCode;
    @TableField("NAME")
    private String name;
    @TableField("DETAIL_LOCATION")
    private String detailLocation;
}
