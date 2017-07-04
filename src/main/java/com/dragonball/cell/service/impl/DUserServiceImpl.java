package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DUserMapper;
import com.dragonball.cell.model.DUser;
import com.dragonball.cell.service.DUserService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DUserServiceImpl extends AbstractService<DUser> implements DUserService {
    @Resource
    private DUserMapper dUserMapper;

}
