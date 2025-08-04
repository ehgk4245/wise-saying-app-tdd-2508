package com.study.standard.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("나의 죽음을 적들에게 알리지 말라!");
        assertThat(author).isEqualTo("이순신");
    }

    @Test
    @DisplayName("TestUtil.setOutToByteArray() 테스트")
    void t2() {
        // given
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray();

        // when
        System.out.println("2 / 이순신 / 나의 죽음을 적들에게 알리지 말라!");

        String out = byteArrayOutputStream.toString().trim();
        TestUtil.clearSetOutToByteArray();

        // then
        assertThat(out).isEqualTo("2 / 이순신 / 나의 죽음을 적들에게 알리지 말라!");
    }
}
