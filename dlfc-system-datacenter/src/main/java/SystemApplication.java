import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by K on 2017/5/29.
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.dlfc.system")
@MapperScan(basePackages = "com.dlfc.system.mapper")
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
