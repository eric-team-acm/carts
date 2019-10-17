package works.weave.socks.cart.configuration;

//import com.example.prometheus_demo.interceptor.RequestTimingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import org.springframework.context.annotation.Configuration;
import works.weave.socks.cart.middleware.RequestCounterInterceptor;
//import works.weave.socks.cart.middleware.HTTPMonitoringInterceptor;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{
	@Autowired
	private RequestCounterInterceptor requestCounterInterceptor;

	//@Autowired
	//private RequestTimingInterceptor requestTimingInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestCounterInterceptor);
		//registry.addInterceptor(requestTimingInterceptor);
	}
}
