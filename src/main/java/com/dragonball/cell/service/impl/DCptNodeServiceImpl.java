package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DCptNodeMapper;
import com.dragonball.cell.model.DCptNode;
import com.dragonball.cell.service.DCptNodeService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DCptNodeServiceImpl extends AbstractService<DCptNode> implements DCptNodeService {
    @Resource
    private DCptNodeMapper dCptNodeMapper;

}
