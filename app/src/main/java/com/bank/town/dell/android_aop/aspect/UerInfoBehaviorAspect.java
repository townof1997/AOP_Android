package com.bank.town.dell.android_aop.aspect;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by dell on 2019/3/23.
 */
@Aspect
public class UerInfoBehaviorAspect {
    @Pointcut("com.bank.town.dell.android_aop.annotation.UserInfoBehaviorTrace * *(..))")
    public void methodAnnotateWithBehaviorTrance(){

    }
    @Before("methodAnnotateWithBehaviorTrance()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.i("town", "被执行了一次");
//        Object obj = joinPoint.proceed();
        return null;
    }
}
