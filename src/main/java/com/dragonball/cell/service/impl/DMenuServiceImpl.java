package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DMenuMapper;
import com.dragonball.cell.model.DMenu;
import com.dragonball.cell.service.DMenuService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/01.
 */
@Service
@Transactional
public class DMenuServiceImpl extends AbstractService<DMenu> implements DMenuService {
    @Resource
    private DMenuMapper dMenuMapper;

}
