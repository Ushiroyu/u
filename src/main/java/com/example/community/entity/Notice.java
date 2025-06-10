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
@TableName("NOTICE")
public class Notice implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer id;
    @TableField("ACTION_USER_ID")
    private String actionUserId;
    @TableField("TITLE")
    private String title;
    @TableField("CONTENT")
    private String content;
    @TableField("REASON")
    private String reason;
    @TableField("CREATE_TIME")
    private String createTime;
    @TableField("MODE")
    private Integer mode;
}
