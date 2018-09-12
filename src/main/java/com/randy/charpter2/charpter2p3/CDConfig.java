package com.randy.charpter2.charpter2p3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:spring-config.xml")
public class CDConfig {
    @Bean(name = "compactDisc")
    public CompactDisc compactDisc() {
        return new CompactDiscImpl();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc cd) {
        return new CDPlayerImpl(cd);
    }
}
