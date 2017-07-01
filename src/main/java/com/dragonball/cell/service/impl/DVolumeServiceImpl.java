package com.dragonball.cell.service.impl;

import com.dragonball.cell.dao.DVolumeMapper;
import com.dragonball.cell.model.DVolume;
import com.dragonball.cell.service.DVolumeService;
import com.dragonball.cell.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/01.
 */
@Service
@Transactional
public class DVolumeServiceImpl extends AbstractService<DVolume> implements DVolumeService {
    @Resource
    private DVolumeMapper dVolumeMapper;

}
