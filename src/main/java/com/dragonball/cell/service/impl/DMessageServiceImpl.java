package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DMessageMapper;
import com.dragonball.cell.model.DMessage;
import com.dragonball.cell.service.DMessageService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class DMessageServiceImpl extends AbstractService<DMessage> implements DMessageService {
    @Resource
    private DMessageMapper dMessageMapper;

}
