package multi.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackageClasses = SpringbootMultiDatabaseExampleApplication.class)
public class SpringbootMultiDatabaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMultiDatabaseExampleApplication.class, args);
	}

}
