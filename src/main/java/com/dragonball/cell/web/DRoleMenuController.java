package com.dragonball.cell.web;

import com.dragonball.cell.core.Result;
import com.dragonball.cell.core.ResultGenerator;
import com.dragonball.cell.model.DRoleMenu;
import com.dragonball.cell.service.DRoleMenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/04.
*/
@RestController
@RequestMapping("/role/menu")
public class DRoleMenuController {
    @Resource
    private DRoleMenuService dRoleMenuService;

    @PostMapping
    public Result add(DRoleMenu dRoleMenu) {
        dRoleMenuService.save(dRoleMenu);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        dRoleMenuService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(DRoleMenu dRoleMenu) {
        dRoleMenuService.update(dRoleMenu);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        DRoleMenu dRoleMenu = dRoleMenuService.findById(id);
        return ResultGenerator.genSuccessResult(dRoleMenu);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<DRoleMenu> list = dRoleMenuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
