package demo.ding.spring.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	@Async
	public void executeAsyncTask(){
		
	}
}
