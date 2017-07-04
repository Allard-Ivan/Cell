package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DAlarm;
import com.dragonball.cell.service.DAlarmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/04.
*/
@RestController
@RequestMapping("/alarm")
public class DAlarmController {
    @Resource
    private DAlarmService dAlarmService;

    @PostMapping
    public Result add(DAlarm dAlarm) {
        dAlarmService.save(dAlarm);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dAlarmService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DAlarm dAlarm) {
        dAlarmService.update(dAlarm);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DAlarm dAlarm = dAlarmService.findById(id);
        return ResultGenerator.genSuccessResult(dAlarm);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DAlarm> list = dAlarmService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
