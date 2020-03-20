package net.nowtryz.info641.tp1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputTester {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public OutputTester() {
        init();
    }

    public void init() {
        outContent.reset();
        System.setOut(new PrintStream(outContent));
    }

    public String getOutput() {
        return outContent.toString();
    }

    public void reset() {
        System.setOut(originalOut);
    }
}
