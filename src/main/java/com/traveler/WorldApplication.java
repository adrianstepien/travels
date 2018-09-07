package com.traveler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.TimeZone;

@SpringBootApplication
public class WorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldApplication.class, args);
	}

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	/*@Configuration
	public class dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setUser("admin");
		dataSource.setPassword("adrian997");
		dataSource.setURL("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setImplicitCachingEnabled(true);
		dataSource.setFastConnectionFailoverEnabled(true);
		return dataSource;
	}*/

	//change the date format in JSON(eg GMT) to default
	@Bean
	public Jackson2ObjectMapperBuilderCustomizer jacksonObjectMapperCustomization() {
		return jacksonObjectMapperBuilder ->
				jacksonObjectMapperBuilder.timeZone(TimeZone.getDefault());
	}
}
