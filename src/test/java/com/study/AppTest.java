package com.study;

import com.study.standard.util.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    @DisplayName("`== 명언 앱 ==` 출력")
    void t1() {
        // given
        Scanner scanner = new Scanner("");
        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
        App app = new App(scanner);

        // when
        app.run();
        String rs = output.toString().trim();

        // then
        assertThat(rs).contains("== 명언 앱 ==");
    }
}