package com.randy.charpter3.charpter3p4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Charpter3p4Config.class)
public class MagicBeanTest {

    @Autowired
    private MagicBean magicBean;
    @Test
    public void testMagicBeanIsExist(){
        System.out.println(magicBean.hashCode());
    }
}
