package com.webgallery;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.webgallery.**.mapper"})
@Slf4j
public class WebGalleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebGalleryApplication.class, args);
        log.info(DateUtil.now()+"--启动成功");
    }

}
