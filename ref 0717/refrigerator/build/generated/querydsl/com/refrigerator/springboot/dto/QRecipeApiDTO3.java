package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QRecipeApiDTO3 is a Querydsl Projection type for RecipeApiDTO3
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QRecipeApiDTO3 extends ConstructorExpression<RecipeApiDTO3> {

    private static final long serialVersionUID = 1522619395L;

    public QRecipeApiDTO3(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> rep_nm, com.querydsl.core.types.Expression<String> info_eng, com.querydsl.core.types.Expression<String> rcp_part, com.querydsl.core.types.Expression<String> manual) {
        super(RecipeApiDTO3.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class}, id, rep_nm, info_eng, rcp_part, manual);
    }

}

