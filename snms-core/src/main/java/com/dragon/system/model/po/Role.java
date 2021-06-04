package com.dragon.system.model.po;

import com.dragon.base.model.po.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author 刘成龙
 * @Description:
 * @date 2021/6/4 16:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Role extends BasePO {

    private String name;

    private List<User> users;

    private List<Menu> menus;

}
