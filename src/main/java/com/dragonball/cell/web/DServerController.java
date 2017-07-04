package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DServer;
import com.dragonball.cell.service.DServerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/04.
*/
@RestController
@RequestMapping("/server")
public class DServerController {
    @Resource
    private DServerService dServerService;

    @PostMapping
    public Result add(DServer dServer) {
        dServerService.save(dServer);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dServerService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DServer dServer) {
        dServerService.update(dServer);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DServer dServer = dServerService.findById(id);
        return ResultGenerator.genSuccessResult(dServer);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DServer> list = dServerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
