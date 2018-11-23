package com.kolema.infbase.rest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "test",description = "测试接口")
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "api",notes = "hah")
    @PostMapping("/api")
    public ResponseEntity testApi(){
        return new ResponseEntity(null);
    }

}
