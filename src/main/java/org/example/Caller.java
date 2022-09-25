package org.example;

import java.util.concurrent.Callable;

@ClassPreamble (
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"} // Note array notation
)
public class Caller implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("callable");
        return null;
    }
}
