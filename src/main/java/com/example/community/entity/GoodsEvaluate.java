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
@TableName("GOODS_EVALUATE")
public class GoodsEvaluate implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer id;
    @TableField("ORDER_ITEM_ID")
    private Integer orderItemId;
    @TableField("LEVEL")
    private Integer level;
    @TableField("USER_NOTE")
    private String userNote;
    @TableField("STORE_NOTE")
    private String storeNote;
    @TableField("CREATE_TIME")
    private String createTime;
    @TableField("UPDATE_TIME")
    private String updateTime;
}
