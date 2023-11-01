package javarush.tasks.JavaCore.tasks09.task1911;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
       
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);
        testString.printSomething();

        System.setOut(originalOut);

        String result = outputStream.toString();

        result = result.toUpperCase();

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
    
    class UpperCasePrintStream extends PrintStream {
    public UpperCasePrintStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        String str = new String(buf, off, len);
        String upperCaseStr = str.toUpperCase();
        super.write(upperCaseStr.getBytes(), 0, upperCaseStr.length());
    }

    @Override
    public void println(String x) {
        String upperCaseStr = x.toUpperCase();
        super.println(upperCaseStr);
    }
        
    }
}
