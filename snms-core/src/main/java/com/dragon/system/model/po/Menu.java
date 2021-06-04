package com.dragon.system.model.po;

import com.dragon.base.model.po.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 刘成龙
 * @Description:
 * @date 2021/6/4 16:17
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Menu extends BasePO {

    private String name;

    private String url;

    private User creator;

}
