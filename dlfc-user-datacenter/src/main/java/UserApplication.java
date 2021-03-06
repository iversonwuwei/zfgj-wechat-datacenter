import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by K on 2017/5/29.
 */

@SpringCloudApplication
@ComponentScan(basePackages = "com.dlfc.user")
@MapperScan(basePackages = "com.dlfc.user.mapper")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
