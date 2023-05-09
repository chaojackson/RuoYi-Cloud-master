package com.ruoyi.gen.mq;

import com.ruoyi.gen.domain.Demo01Message;
import com.ruoyi.gen.service.MySink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @ClassName Demo01Consumer
 * @Description
 * @Author zyc
 * @Date 2023/5/6 10:04
 */
@Component
public class Demo01Consumer {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @StreamListener(MySink.DEMO01_INPUT)
    public void onMessage(@Payload Demo01Message message) {
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
    }
}
