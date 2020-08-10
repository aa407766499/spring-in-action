package com.huzi.study.springinaction.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author lsx
 * @date 2020/8/3 18:20
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;

    private final String name;

    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
