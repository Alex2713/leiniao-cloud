package com.huweilong.leiniao.server.data.simple.test.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * demo输入请求参数
 * @author Alex
 */
@Data
@ApiModel(value = "demo输入请求参数")
public class DemoInput {
    /**
     * id
     */
    @NotNull(message = "id不能为空")
    @ApiModelProperty(value = "id",name = "id",required = true, example = "1")
    private Long id;

    /**
     * 名称
     */
    @NotBlank(message = "名称不能为空")
    @ApiModelProperty(value = "名称", required = true, example = "Alex")
    private String name;
}
