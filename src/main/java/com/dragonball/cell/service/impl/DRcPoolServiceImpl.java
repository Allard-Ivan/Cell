package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DRcPoolMapper;
import com.dragonball.cell.model.DRcPool;
import com.dragonball.cell.service.DRcPoolService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DRcPoolServiceImpl extends AbstractService<DRcPool> implements DRcPoolService {
    @Resource
    private DRcPoolMapper dRcPoolMapper;

}
