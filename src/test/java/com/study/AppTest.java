package com.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    @DisplayName("`== 명언 앱 ==` 출력")
    void t1() {
        String rs = new AppTestRunner().run("");
        assertThat(rs).contains("== 명언 앱 ==");
    }
}