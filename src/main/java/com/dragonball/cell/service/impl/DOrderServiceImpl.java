package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DOrderMapper;
import com.dragonball.cell.model.DOrder;
import com.dragonball.cell.service.DOrderService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/01.
 */
@Service
@Transactional
public class DOrderServiceImpl extends AbstractService<DOrder> implements DOrderService {
    @Resource
    private DOrderMapper dOrderMapper;

}
