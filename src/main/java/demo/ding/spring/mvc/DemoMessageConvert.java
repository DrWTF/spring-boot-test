package demo.ding.spring.mvc;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class DemoMessageConvert extends AbstractHttpMessageConverter<MvcConfig> {

	public DemoMessageConvert() {
		super(new MediaType("application", "x-ding", Charset.forName("UTF-8")));
	}
	
	@Override
	protected boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return MvcConfig.class.isAssignableFrom(clazz);
	}

	@Override
	protected MvcConfig readInternal(Class<? extends MvcConfig> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void writeInternal(MvcConfig t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		outputMessage.getBody().write(t.toString().getBytes());
	}

}
