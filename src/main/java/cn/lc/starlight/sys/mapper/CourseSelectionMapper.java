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
 * @author l
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
