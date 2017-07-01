package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DNetwork;
import com.dragonball.cell.service.DNetworkService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/01.
*/
@RestController
@RequestMapping("/network")
public class DNetworkController {
    @Resource
    private DNetworkService dNetworkService;

    @PostMapping
    public Result add(DNetwork dNetwork) {
        dNetworkService.save(dNetwork);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dNetworkService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DNetwork dNetwork) {
        dNetworkService.update(dNetwork);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DNetwork dNetwork = dNetworkService.findById(id);
        return ResultGenerator.genSuccessResult(dNetwork);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DNetwork> list = dNetworkService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
