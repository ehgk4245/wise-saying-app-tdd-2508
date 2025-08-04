package com.study.standard.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TestUtilTest {

    @Test
    @DisplayName("TestUtil.genScanner() 테스트")
    void t1() {
        // given
        Scanner scanner = TestUtil.genScanner("""
                등록
                나의 죽음을 적들에게 알리지 말라!
                이순신
                """);

        // when
        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String author = scanner.nextLine();

        // then
        Assertions.assertThat(cmd).isEqualTo("등록");
        Assertions.assertThat(content).isEqualTo("나의 죽음을 적에게 알리지 말라!");
        Assertions.assertThat(author).isEqualTo("이순신");
    }
}
