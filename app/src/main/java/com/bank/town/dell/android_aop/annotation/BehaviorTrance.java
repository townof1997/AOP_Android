package com.bank.town.dell.android_aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dell on 2019/3/23.
 */

@Target(ElementType.METHOD)//修饰对象
@Retention(RetentionPolicy.RUNTIME)//保留时机
public @interface BehaviorTrance {
    String value();
}
