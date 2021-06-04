package com.dragon.base.model.po;

import lombok.Data;

import java.util.Date;

/**
 * @author 刘成龙
 * @Description:
 * @date 2021/6/4 16:13
 */
@Data
public abstract class BasePO {

    protected Long id;

    protected Boolean used;

    protected Date createTime;
}
