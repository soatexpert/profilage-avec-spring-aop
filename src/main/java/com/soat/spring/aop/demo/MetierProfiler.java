package com.soat.spring.aop.demo;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MetierProfiler {
	static final Logger logger = Logger.getLogger(MetierProfiler.class);

	@Pointcut("execution(* com.soat.spring.aop.demo.*.*(..))")
	public void fonctionMetier() {
	}

	@Around("fonctionMetier()")
	public Object profile(ProceedingJoinPoint joinPoint) throws Throwable {
		long debut = System.currentTimeMillis();

		logger.info("Apelle de la fonction ...");
		Object sortie = joinPoint.proceed();

		logger.info("Fonction executee avec succees ...");
		long tempsPasse = System.currentTimeMillis() - debut;

		logger.info("Temps d'exécution de la fonction: " + tempsPasse
				+ " milliseconds.");

		return sortie;
	}

}