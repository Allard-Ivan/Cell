package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DExample;
import com.dragonball.cell.service.DExampleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/04.
*/
@RestController
@RequestMapping("/example")
public class DExampleController {
    @Resource
    private DExampleService dExampleService;

    @PostMapping
    public Result add(DExample dExample) {
        dExampleService.save(dExample);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dExampleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DExample dExample) {
        dExampleService.update(dExample);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DExample dExample = dExampleService.findById(id);
        return ResultGenerator.genSuccessResult(dExample);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DExample> list = dExampleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
