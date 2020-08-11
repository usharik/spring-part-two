package ru.geekbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(FeignConfig.class)
public class ShopUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopUiApplication.class, args);
    }

}
