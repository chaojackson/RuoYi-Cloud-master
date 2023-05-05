package com.ruoyi.system.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @ClassName MySource
 * @Description TODO
 * @Author zyc
 * @Date 2023/5/5 22:42
 * @Version 1.0
 */
public interface MySource {
    @Output("demo01-output")
    MessageChannel demo01Output();
}
