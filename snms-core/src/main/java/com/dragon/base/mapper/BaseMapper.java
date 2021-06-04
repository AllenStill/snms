package com.dragon.base.mapper;

import com.dragon.base.model.po.BasePO;

import java.util.List;

/**
 * @ClassName: BaseMapper
 * @Description: 抽象mapper类
 * @Author
 * @Date 2021/6/4
 * @Version 1.0
 */
public interface BaseMapper<PO extends BasePO> {

    void insert(PO po);

    void removeById(Long id);

    void update(PO po);

    PO findById(Long id);

    List<PO> findByParams(PO params);

}
