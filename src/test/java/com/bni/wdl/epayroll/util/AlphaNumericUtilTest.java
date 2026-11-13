package com.bni.wdl.epayroll.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AlphaNumericUtilTest {

    @Test
    void generateTransactionId_test() {
        log.info("===> {}", AlphaNumericUtil.generateTransactionId());
    }
}
