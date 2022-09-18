package sshukla.spring.transactional.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringTransactionalExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionalExampleApplication.class, args);
	}

}
