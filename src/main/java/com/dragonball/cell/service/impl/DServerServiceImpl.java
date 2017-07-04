package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DServerMapper;
import com.dragonball.cell.model.DServer;
import com.dragonball.cell.service.DServerService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DServerServiceImpl extends AbstractService<DServer> implements DServerService {
    @Resource
    private DServerMapper dServerMapper;

}
