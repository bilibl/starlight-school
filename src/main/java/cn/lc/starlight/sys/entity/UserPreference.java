package cn.lc.starlight.sys.entity;

import cn.lc.starlight.common.tools.BaseEntity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "UserPreference对象", description = "")
public class UserPreference extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String courseId;

    private String val;

    private String time;

    private String userIdLong;

    private String courseIdLong;


}
