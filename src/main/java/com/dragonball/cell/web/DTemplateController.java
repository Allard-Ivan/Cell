package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DTemplate;
import com.dragonball.cell.service.DTemplateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/01.
*/
@RestController
@RequestMapping("/template")
public class DTemplateController {
    @Resource
    private DTemplateService dTemplateService;

    @PostMapping
    public Result add(DTemplate dTemplate) {
        dTemplateService.save(dTemplate);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dTemplateService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DTemplate dTemplate) {
        dTemplateService.update(dTemplate);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DTemplate dTemplate = dTemplateService.findById(id);
        return ResultGenerator.genSuccessResult(dTemplate);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DTemplate> list = dTemplateService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
