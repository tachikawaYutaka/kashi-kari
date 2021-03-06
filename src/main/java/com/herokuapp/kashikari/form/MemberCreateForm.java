package com.herokuapp.kashikari.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class MemberCreateForm {
    @NotNull
    @Size(min=1,max=255)
    private String name;
    @NotNull
    private Long money;
}
