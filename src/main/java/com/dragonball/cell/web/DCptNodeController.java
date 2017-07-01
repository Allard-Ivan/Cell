package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DCptNode;
import com.dragonball.cell.service.DCptNodeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/01.
*/
@RestController
@RequestMapping("/cpt/node")
public class DCptNodeController {
    @Resource
    private DCptNodeService dCptNodeService;

    @PostMapping
    public Result add(DCptNode dCptNode) {
        dCptNodeService.save(dCptNode);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dCptNodeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DCptNode dCptNode) {
        dCptNodeService.update(dCptNode);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DCptNode dCptNode = dCptNodeService.findById(id);
        return ResultGenerator.genSuccessResult(dCptNode);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DCptNode> list = dCptNodeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
