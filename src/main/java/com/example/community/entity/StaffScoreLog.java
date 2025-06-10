package com.example.community.entity;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("STAFF_SCORE_LOG")
public class StaffScoreLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private String ID;
    @TableField("USER_ID")
    private String userId;
    @TableField("CHANGE_SCORE")
    private BigDecimal changeScore;
    @TableField("BEFORE_SCORE")
    private BigDecimal beforeScore;
    @TableField("AFTER_SCORE")
    private BigDecimal afterScore;
    @TableField("ACTION_USER_ID")
    private String actionUserId;
    @TableField("REASON")
    private String reason;
    @TableField("LOG_TIME")
    private String logTime;
    @TableField("ACTION")
    private Boolean action;
}
