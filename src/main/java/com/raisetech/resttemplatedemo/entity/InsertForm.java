package com.raisetech.resttemplatedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor

public class InsertForm {

    private int id;

    private String name;


}
