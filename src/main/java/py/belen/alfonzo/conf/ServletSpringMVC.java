package py.belen.alfonzo.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends 
AbstractAnnotationConfigDispatcherServletInitializer { 
 
 	 
 	//Clases a ser cargadas por el contairner del propio Spring 
 	@Override 
 	protected Class<?>[] getRootConfigClasses() {  	 // TODO Auto-generated method stub 
 	 	return new Class[]{AppWebConfiguration.class,JPAConfiguration.class}; }; 
 	
 
 	 
 
 	@Override 
 	protected Class<?>[] getServletConfigClasses() {  	 	// Se tiene que colocar aqui para ser adicionada en el  cargamiento de la servlet 
 	 	// base 
 	 	return new Class[] {}; 
 	} 
 
 	//ServletMappings utilizado anteriormente en el web.xml 
 	@Override 
 	protected String[] getServletMappings() {  	 	// TODO Auto-generated method stub 
 	 	return new String[] {"/"}; 
 	} 
} 

