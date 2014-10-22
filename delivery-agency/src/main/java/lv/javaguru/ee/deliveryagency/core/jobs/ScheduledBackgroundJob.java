package lv.javaguru.ee.deliveryagency.core.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScheduledBackgroundJob implements Runnable {

	private static final Logger log = LoggerFactory.getLogger(ScheduledBackgroundJob.class);

	@Autowired
	private PrototypeBean prototypeBean;
	
	@Override
	public void run() {
		log.info("ScheduledBackgroundTask started!");
		log.info("HASH" + prototypeBean.hashCode());
	}
	
}
