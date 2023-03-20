package cn.lc.starlight.sys.entity;

import cn.lc.starlight.common.tools.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * chrimer
 * </p>
 *
 * @author 实训三组
 * @since 2020-06-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "InterestSelection对象", description = "")
public class InterestSelection extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生id")
    private String studentId;

    @ApiModelProperty(value = "兴趣id，直接在课程子分类中选择")
    private String childCategoryId;


}
