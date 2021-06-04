package com.dragon.system.model.po;

import com.dragon.base.model.po.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 刘成龙
 * @Description:
 * @date 2021/6/4 16:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Dictionary extends BasePO {

    private String name;

    private DictionaryType type;

    private User creator;
}
