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
 * @since 2020-06-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "Chapter对象", description = "")
public class Chapter extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "课程id")
    private String courseId;

    @ApiModelProperty(value = "章节")
    private String chapter;


}
