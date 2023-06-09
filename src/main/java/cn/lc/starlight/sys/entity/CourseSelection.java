package cn.lc.starlight.sys.entity;

import cn.lc.starlight.common.tools.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "CourseSelection对象", description = "")
public class CourseSelection extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生id")
    private String studentId;

    @ApiModelProperty(value = "课程id")
    private String courseId;


}
