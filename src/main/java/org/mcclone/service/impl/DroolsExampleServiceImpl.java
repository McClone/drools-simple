package org.mcclone.service.impl;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.mcclone.service.DroolsExampleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcclone on 17-1-17.
 */
@Service
@Slf4j
public class DroolsExampleServiceImpl implements DroolsExampleService {

    @KSession("ksession")
    private KieSession ksession;

    @Override
    public int fireAllRules() {
        YearCount yearCount = new YearCount(10);
        ksession.insert(yearCount);
        final List<String> list = new ArrayList<>();
        //设置全局变量用来返回数据
        ksession.setGlobal("list", list);
        int count = ksession.fireAllRules();
        log.info("返回结果" + list.toString());
        ksession.dispose();
        return count;

    }

    @Data
    public static final class YearCount {
        private int count;

        public YearCount() {
        }

        public YearCount(int count) {
            this.count = count;
        }
    }
}
