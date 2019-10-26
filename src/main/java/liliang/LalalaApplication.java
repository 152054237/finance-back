package liliang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("liliang.dao")
public class LalalaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LalalaApplication.class, args);
    }

}
