package com.softium.panda.pandawiki;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.softium.panda")
public class PandaWikiApplication {
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(PandaWikiApplication.class);

    public static void main(String[] args) {
        SpringApplication app =new SpringApplication(PandaWikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！");
        LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }

}
