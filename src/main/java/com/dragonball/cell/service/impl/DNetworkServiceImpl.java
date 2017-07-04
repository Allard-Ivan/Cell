package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DNetworkMapper;
import com.dragonball.cell.model.DNetwork;
import com.dragonball.cell.service.DNetworkService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DNetworkServiceImpl extends AbstractService<DNetwork> implements DNetworkService {
    @Resource
    private DNetworkMapper dNetworkMapper;

}
