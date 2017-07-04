package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DMirror;
import com.dragonball.cell.service.DMirrorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/04.
*/
@RestController
@RequestMapping("/mirror")
public class DMirrorController {
    @Resource
    private DMirrorService dMirrorService;

    @PostMapping
    public Result add(DMirror dMirror) {
        dMirrorService.save(dMirror);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dMirrorService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DMirror dMirror) {
        dMirrorService.update(dMirror);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DMirror dMirror = dMirrorService.findById(id);
        return ResultGenerator.genSuccessResult(dMirror);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DMirror> list = dMirrorService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
