package com.mooc;
/*
* 配置spring和junit整合，junit启动springIOC容器*/

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
        //告诉junit   spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml",
        "classpath:spring/spring-redis.xml"
})
public class BaseTest {
}
