package kz.zhelezyaka.openFeign.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "kz.zhelezyaka.openFeign.proxy")
public class ProjectConfig {
}