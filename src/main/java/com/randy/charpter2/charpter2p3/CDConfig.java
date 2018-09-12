package com.randy.charpter2.charpter2p3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
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
