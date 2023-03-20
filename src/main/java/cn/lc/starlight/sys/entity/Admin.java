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
@ApiModel(value = "Admin对象", description = "")
public class Admin extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "该管理员对应的账号的id")
    private String userId;


}
