package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DRoleMenuMapper;
import com.dragonball.cell.model.DRoleMenu;
import com.dragonball.cell.service.DRoleMenuService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/01.
 */
@Service
@Transactional
public class DRoleMenuServiceImpl extends AbstractService<DRoleMenu> implements DRoleMenuService {
    @Resource
    private DRoleMenuMapper dRoleMenuMapper;

}
