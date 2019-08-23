package cn.com.alvin.bucket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 启动类
 * @author CAIFUCHENG3
 */
@SpringBootApplication
public class BucketApplication extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(BucketApplication.class,args);
    }

}