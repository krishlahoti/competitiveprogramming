package org.example.concurrency;

import java.util.stream.Stream;

public class PlatformVsVirtual {


    static void waitUp() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {

        //Thread.ofPlatform().start(() -> System.out.println("Hello"));

        System.out.println("Hello WOrld");


    }

}
