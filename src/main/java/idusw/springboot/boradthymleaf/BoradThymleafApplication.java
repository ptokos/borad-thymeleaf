package idusw.springboot.boradthymleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //(exclude = DataSourceAutoConfiguration.class)
public class BoradThymleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoradThymleafApplication.class, args);
    }

}
