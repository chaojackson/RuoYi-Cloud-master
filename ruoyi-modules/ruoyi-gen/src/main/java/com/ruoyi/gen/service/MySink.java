package com.ruoyi.gen.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @ClassName MySink
 * @Description
 * @Author zyc
 * @Date 2023/5/6 9:55
 */
public interface MySink {

    String DEMO01_INPUT = "demo01-input";

    @Input(DEMO01_INPUT)
    SubscribableChannel demo01Input();
}
