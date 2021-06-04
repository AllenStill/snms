package com.dragon.system.model.po;

import com.dragon.base.model.po.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author 刘成龙
 * @Description:
 * @date 2021/6/4 16:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DictionaryType extends BasePO {

    private String name;

    private Menu menu;

    private User creator;

    private List<Dictionary> dictionaries;
}
