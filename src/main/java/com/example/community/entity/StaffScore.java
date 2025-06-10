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
@TableName("STAFF_SCORE")
public class StaffScore implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private String ID;
    @TableField("USER_ID")
    private String userId;
    @TableField("SCORE")
    private BigDecimal score;
    public StaffScore(String userId) {
        this.userId = userId;
        this.score = BigDecimal.valueOf(100);
    }
}
