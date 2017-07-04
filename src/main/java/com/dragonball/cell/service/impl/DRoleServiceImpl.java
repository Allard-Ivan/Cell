package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DRoleMapper;
import com.dragonball.cell.model.DRole;
import com.dragonball.cell.service.DRoleService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DRoleServiceImpl extends AbstractService<DRole> implements DRoleService {
    @Resource
    private DRoleMapper dRoleMapper;

}
