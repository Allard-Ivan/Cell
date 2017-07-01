package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DAlarmMapper;
import com.dragonball.cell.model.DAlarm;
import com.dragonball.cell.service.DAlarmService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/01.
 */
@Service
@Transactional
public class DAlarmServiceImpl extends AbstractService<DAlarm> implements DAlarmService {
    @Resource
    private DAlarmMapper dAlarmMapper;

}
