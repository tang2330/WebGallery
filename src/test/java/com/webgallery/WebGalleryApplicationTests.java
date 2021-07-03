package com.webgallery;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class WebGalleryApplicationTests {

    @Test
    void contextLoads() {
        log.info(DateUtil.now()+"--测试通过");
    }

}
