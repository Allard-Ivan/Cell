package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DMirrorMapper;
import com.dragonball.cell.model.DMirror;
import com.dragonball.cell.service.DMirrorService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/01.
 */
@Service
@Transactional
public class DMirrorServiceImpl extends AbstractService<DMirror> implements DMirrorService {
    @Resource
    private DMirrorMapper dMirrorMapper;

}
