package com.study;

import com.study.standard.util.TestUtil;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {

    public String run(String input) {
        Scanner scanner = TestUtil.genScanner(input);

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();
        new App(scanner).run();
        TestUtil.clearSetOutToByteArray();

        return outputStream.toString();
    }
}
