package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DExampleMapper;
import com.dragonball.cell.model.DExample;
import com.dragonball.cell.service.DExampleService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DExampleServiceImpl extends AbstractService<DExample> implements DExampleService {
    @Resource
    private DExampleMapper dExampleMapper;

}
