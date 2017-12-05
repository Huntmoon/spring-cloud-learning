package com.huntmoon.swagger.controller;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @auther huntmoon
 * @since 2017/12/5.
 */
@Data
public class Test {
    @NotEmpty
    @ApiModelProperty(value = "名字")
    private String name;
}
