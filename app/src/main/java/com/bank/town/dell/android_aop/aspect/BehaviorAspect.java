package com.bank.town.dell.android_aop.aspect;

import android.util.Log;

import com.bank.town.dell.android_aop.annotation.BehaviorTrance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by dell on 2019/3/23.
 */
@Aspect
public class BehaviorAspect {
    //定义切面规则
    //1，切面长什么样子，哪些方面应该放到这个切面处理
    //把代码中有注解BehaviorTrance的所有内容都加入到这个切面上
    @Pointcut("execution(@com.bank.town.dell.android_aop.annotation.BehaviorTrance * *(..))")
    public void methodAnnotatateWithBehaviorTrance(){//这个方法采用Around方式

    }
    //2，定义切面上的使用规则

    //3,@Before 在切入点之前执行

    //4,@After 在切入点之后执行

    //@Around 在切入点前后执行

    @Around("methodAnnotatateWithBehaviorTrance()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws  Throwable {
        //当前执行的内容是哪个类里面的
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        //当前执行的是哪个方法
        String methodName = methodSignature.getName();
        //当前执行了什么样的功能
        BehaviorTrance behaviorTrance = methodSignature.getMethod().getAnnotation(BehaviorTrance.class);
        String funName = behaviorTrance.value();
        long begin = System.currentTimeMillis();
        //执行功能
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - begin;
        //应该把当前时间，性能信息等等存入数据库，定是发送到服务器
        Log.i("town", String.format("功能：%s,%s类的%s方法执行，耗时：%dms",funName,className,methodName,duration));
        Log.i("jett", "功能耗时：" + duration + "ms");
        return result;
    }
}
