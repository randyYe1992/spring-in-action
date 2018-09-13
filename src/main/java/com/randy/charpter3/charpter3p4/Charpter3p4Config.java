package com.randy.charpter3.charpter3p4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@Conditional(MagicExistsCondtion.class)
public class Charpter3p4Config {
    @Bean
    @Primary
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON
    )
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
