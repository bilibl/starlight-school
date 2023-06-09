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
@ApiModel(value = "School对象", description = "")
public class School extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学校名")
    private String name;


}
