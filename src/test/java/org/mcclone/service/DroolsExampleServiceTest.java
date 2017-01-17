package org.mcclone.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by mcclone on 17-1-17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsExampleServiceTest {

    @Resource
    private DroolsExampleService droolsExampleService;

    @Test
    public void fireAllRules() throws Exception {
        System.out.println(droolsExampleService.fireAllRules());
    }

}