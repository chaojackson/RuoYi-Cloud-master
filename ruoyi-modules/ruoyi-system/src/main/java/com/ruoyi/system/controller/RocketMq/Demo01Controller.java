package com.ruoyi.system.controller.RocketMq;


import com.ruoyi.common.core.utils.uuid.IdUtils;
import com.ruoyi.system.domain.Demo01Message;
import com.ruoyi.system.mq.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.Message;

/**
 * @ClassName Demo01Controller
 * @Description TODO
 * @Author zyc
 * @Date 2023/5/5 22:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo01")
public class Demo01Controller {

    @Autowired
    private MySource mySource;


    @RequestMapping("/send")
    public String send(@RequestParam String msg){
       /* 创建message */
        Demo01Message message = new Demo01Message();
        message.setId(IdUtils.fastUUID());
       // <2> 创建 Spring Message 对象
        Message<Demo01Message> springMessage = MessageBuilder.withPayload(message).build();
        mySource.demo01Output().send(springMessage);
        return "success";
    }


}
