package demo.ding.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	
	@Scheduled(fixedRate=5000)
	public void reportCurrentTime(){
		
	}
	
	@Scheduled(cron="0 28 11 ? * *")
	public void fixTimeExecution(){
		
	}
}
