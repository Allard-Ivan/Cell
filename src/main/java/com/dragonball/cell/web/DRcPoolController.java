package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DRcPool;
import com.dragonball.cell.service.DRcPoolService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/04.
*/
@RestController
@RequestMapping("/rc/pool")
public class DRcPoolController {
    @Resource
    private DRcPoolService dRcPoolService;

    @PostMapping
    public Result add(DRcPool dRcPool) {
        dRcPoolService.save(dRcPool);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dRcPoolService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DRcPool dRcPool) {
        dRcPoolService.update(dRcPool);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DRcPool dRcPool = dRcPoolService.findById(id);
        return ResultGenerator.genSuccessResult(dRcPool);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DRcPool> list = dRcPoolService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
