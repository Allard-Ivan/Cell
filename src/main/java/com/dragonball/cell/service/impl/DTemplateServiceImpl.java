package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DTemplateMapper;
import com.dragonball.cell.model.DTemplate;
import com.dragonball.cell.service.DTemplateService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/01.
 */
@Service
@Transactional
public class DTemplateServiceImpl extends AbstractService<DTemplate> implements DTemplateService {
    @Resource
    private DTemplateMapper dTemplateMapper;

}
