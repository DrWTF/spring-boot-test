package demo.ding.spring.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware, ApplicationEventPublisherAware {

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub

	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub

	}

	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub

	}

}
