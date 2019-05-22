package py.belen.alfonzo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



//habilitar el modulo MVC de spring
@EnableWebMvc

//Cargar los paquetes del controller y dao
//@ComponentScan(basePackageClasses = { HomeController.class,ClienteDAO.class})  
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	//indicamos que es un objeto de configuracion
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//prefijo de la pagina
		resolver.setPrefix("/static/");
		//Extension del archivo
		resolver.setSuffix(".html");
		return resolver;
	}
	
	//Habilitar las peticiones para recursos estáticos dentro de AppWebConfiguration.
		@Override
			public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
				configurer.enable();
			}

}
