package com.kolema.infrabbitmq.rest.controller;

import com.kolema.infrabbitmq.rabbit.producer.HelloSender1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * test rabbitmq api
 *
 * @author ware zhang
 * @date 2018/07/30
 */
@Api(value = "TestController", description = "RabbitMQ测试API")
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private HelloSender1 helloSender1;

    @GetMapping("/produce")
    @ApiOperation(value = "生产", notes = "生产消息")
    @ApiImplicitParam(name = "msg", value = "消息", required = true, example = "123456789", paramType = "query", dataType = "String")
    public ResponseEntity testProduce(String msg) {
        if (StringUtils.isEmpty(msg)) {
            msg = "hello1 " + new Date();
        }
        System.out.println("sendMsg:" + msg);
        try {
            helloSender1.send(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(200);
    }

    @GetMapping(value = "/swagger")
    public void testSwagger() {
        System.out.println("111111");
    }

}
