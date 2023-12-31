package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class S05T02N01CarapuigMasnouSergiApplication {

	public static void main(String[] args) {
		SpringApplication.run(S05T02N01CarapuigMasnouSergiApplication.class, args);
	}

}
