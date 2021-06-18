/*========================================
 CalculatorBeforeAdvice.java
 - Before Advice 구성
========================================*/

package com.test.spr;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

// check~!!!
// MethodBeforeAdvice 인터페이스를 implement하면 스프링컨테이너가 알아서 Before Advice 로 처리해준다..
public class CalculatorBeforeAdvice implements MethodBeforeAdvice
{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable
	{
		// 스탑워치 기능 사용
		Log log = LogFactory.getLog(this.getClass());
		log.info("Before Advice 실행 -------------------");
		log.info("주 업무 실행 전에 수행되어야 하는 작업");
		log.info("------------------- Before Advice 실행");
		
	}
	
}
