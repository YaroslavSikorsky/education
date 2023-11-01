package javarush.tasks.JavaCore.tasks09.task1917;

import java.io.FileWriter;
import java.io.IOException;

/* 
Свой FileWriter
*/

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.write(new String(cbuf, off, len).getBytes());
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.write(c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.write(str.getBytes());
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.write(str.substring(off, off + len).getBytes());
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}