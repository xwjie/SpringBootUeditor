package cn.xiaowenjie.ueditor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UEditorApplication {

	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new UEditorController(), "/UEditor/*");
    }
	
	public static void main(String[] args) {
		SpringApplication.run(UEditorApplication.class, args);
	}
}
