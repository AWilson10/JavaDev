package org.example;

import java.io.Closeable;
import java.io.IOException;

public class Closer implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("closer");
    }
}
