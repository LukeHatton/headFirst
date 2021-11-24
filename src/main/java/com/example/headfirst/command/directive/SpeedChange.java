package com.example.headfirst.command.directive;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project : headFirst
 * Package : com.example.headfirst.command.directive
 * <p>Description :标记用注解：速度改变
 *
 * @author :lizhao 2021/11/24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SpeedChange {
}
