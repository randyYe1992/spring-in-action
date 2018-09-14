package com.randy.charpter4.charpter4p2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackageClasses = {Charpter4p2Config.class})
@EnableAspectJAutoProxy//启用自动代理功能
@ImportResource(locations = "classpath:spring-config.xml")
public class Charpter4p2Config {
}
