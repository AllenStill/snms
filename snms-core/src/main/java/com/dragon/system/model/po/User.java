package com.dragon.system.model.po;

import com.dragon.base.model.po.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author 刘成龙
 * @Description: 用户实体类
 * @date 2021/6/4 16:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BasePO {

    private String name;

    private String password;

    private List<Role> roles;
}
