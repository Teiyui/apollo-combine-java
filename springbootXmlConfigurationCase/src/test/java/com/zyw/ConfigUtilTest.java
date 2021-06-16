package com.zyw;

import com.zyw.alternativeEntity.Image;
import com.zyw.alternativeEntity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.senseframework.support.orm.mongodb.Mongo;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-mongo.xml" })
@Slf4j
public class ConfigUtilTest {

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    public void testImageUtil() throws Exception {
        Mongo mongo = Mongo.build(mongoTemplate);
        User user = new User();
        user.setId(1);
        user.setUsername("郑有为");
        user.setPassword("2019zyw413");
        user.setAge(24);
        user.setSex("男");
        user.setEmail("Teiyui@outlook.com");
        mongo.insert(user);
    }
}
