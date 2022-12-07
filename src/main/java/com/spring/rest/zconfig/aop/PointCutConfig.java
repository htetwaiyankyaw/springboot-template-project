package com.spring.rest.zconfig.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 *        It is a point-cut configuration for
 *        <code>ExceptionHandlerAspect</code> and <code>LoggingAspect</code>
 */
public class PointCutConfig {

	@Pointcut("within(@org.springframework.stereotype.Service *)")
	protected void serviceBean() {
	}

	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	protected void daoBean() {
	}

	@Pointcut("execution(* com.spring.rest.zgen.mapper.*.*(..)) || execution(* com.spring.rest.custommapper.*.*(..))")
	protected void mapper() {
	}

	@Pointcut("execution(public * *(..))")
	protected void publicMethod() {
	}

	@Pointcut("publicMethod() && serviceBean()")
	protected void publicMethodInsideServiceBean() {
	}

	@Pointcut("publicMethod() && daoBean()")
	protected void publicMethodInsideDaoBean() {
	}

	@Pointcut("publicMethod() && mapper()")
	protected void publicMethodInsideMapper() {
	}
}
