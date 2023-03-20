package cn.lc.starlight.sys.mapper;

import cn.lc.starlight.sys.entity.CourseSelection;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口 chrimer
 * </p>
 *
 * @author 实训三组
 * @since 2020-06-22
 */
public interface CourseSelectionMapper extends BaseMapper<CourseSelection> {

    /**
     * 获取选课最多的前10条数据
     *
     * @return
     */
    @Select("SELECT *, count(*) AS count FROM course_selection GROUP BY course_id ORDER BY count DESC LIMIT 10")
    List<CourseSelection> getPopCourseList();

}
