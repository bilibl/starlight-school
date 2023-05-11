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
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "Video对象", description = "")
public class Video extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "章节id")
    private String chapterId;

    @ApiModelProperty(value = "视频资源")
    private String videoSrc;


}
