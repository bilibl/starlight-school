package cn.lc.starlight.sys.controller;

import cn.lc.starlight.sys.entity.CourseSelection;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

import cn.lc.starlight.common.constants.Result;
import cn.lc.starlight.sys.mapper.CourseSelectionMapper;

import org.springframework.web.bind.annotation.RestController;
import cn.lc.starlight.common.tools.BaseController;

/**
 * <p>
 * 前端控制器 chrimer
 * </p>
 *
 * @author 实训三组
 * @since 2020-06-22
 */
@RestController
@RequestMapping("/sys/course-selection")
public class CourseSelectionController extends BaseController {
    @Autowired
    private CourseSelectionMapper courseSelectionMapper;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", paramType = "query", value = "当前页码", required = true),
            @ApiImplicitParam(name = "pageSize", paramType = "query", value = "每页显示记录数", required = true)
    })
    @ApiOperation(value = "分页获取CourseSelection信息")
    @RequestMapping(method = RequestMethod.POST, value = "/page")
    public Result page(
            Integer pageNum,
            Integer pageSize) {
        Result result = new Result();
        Page<CourseSelection> page = new Page<CourseSelection>(pageNum, pageSize);
        CourseSelection parms = new CourseSelection();
        QueryWrapper<CourseSelection> wrapper = new QueryWrapper<CourseSelection>(parms);

        result.setData(courseSelectionMapper.selectPage(page, wrapper));
        return result;
    }

    @ApiOperation(value = "保存修改CourseSelection信息")
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public Result save(@RequestBody CourseSelection entity) {
        Result result = new Result();
        if (entity.getId() == null) {
            courseSelectionMapper.insert(entity);
        } else {
            courseSelectionMapper.updateById(entity);
        }
        return result;
    }

    @ApiOperation(value = "按id删除CourseSelection，可以传入多个id用，隔开")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids", paramType = "query", value = "传入的id串，用，隔开", required = true)
    })
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    public Result delete(String ids) {
        Result result = new Result();
        List<String> deleteIds = new ArrayList<String>();
        for (String id : ids.split(",")) {
            deleteIds.add(id);
        }
        courseSelectionMapper.deleteBatchIds(deleteIds);
        return result;
    }

}
