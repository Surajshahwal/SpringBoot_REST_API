package in.suraj.congif;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import in.suraj.entity.Book;
@Configuration
public class MyDataRestConfg implements RepositoryRestConfigurer {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
	HttpMethod[] unsupportedMethods= {HttpMethod.PUT, HttpMethod.DELETE};
	
	config.getExposureConfiguration()
	      .forDomainType(Book.class)
	      .withItemExposure((metadata,http)->
	      http.disable(unsupportedMethods))
	      .withCollectionExposure((metedata,http)->
	      http.disable(unsupportedMethods));
	     
	    		   

}
}
