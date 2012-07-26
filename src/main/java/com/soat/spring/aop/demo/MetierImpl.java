package com.soat.spring.aop.demo;

import org.apache.log4j.Logger;

public class MetierImpl implements Metier {
	static final Logger logger = Logger.getLogger(MetierImpl.class);
	int res = 20;

	public int jeTravaille() {

		logger.info("debut traitement metiers");
		try {
			// traitements métiers
			logger.info("traitement metiers en cours");
			res++;
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			logger.error("Erreur lors du traitement métier");
			return 0;
		}

		logger.info("Fin traitement metiers");
		return res;
	}

}
