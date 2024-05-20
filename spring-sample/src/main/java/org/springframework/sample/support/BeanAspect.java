package org.springframework.sample.support;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BeanAspect {

	@Pointcut("execution(* *..BeanInterface.execute(..))")
	public void pointcut() {
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.printf("Before %s execute%n", pjp.getSignature().getDeclaringType() + "." + pjp.getSignature().getName());
		Object result = pjp.proceed();
		System.out.printf("After %s execute%n", pjp.getSignature().getDeclaringType() + "." + pjp.getSignature().getName());
		return result;
	}
}
