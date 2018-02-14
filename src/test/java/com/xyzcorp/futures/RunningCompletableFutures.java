package com.xyzcorp.futures;

import java.util.concurrent.CompletableFuture;

public class RunningCompletableFutures {
    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 30;
        })
                .thenApply(x -> x + 10)
                .thenAccept(System.out::println);
    }

    public void pseudoCodeOfWhatToExpect() {
        // json
    }
}
