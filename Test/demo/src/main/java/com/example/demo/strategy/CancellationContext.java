package com.example.demo.strategy;

public class CancellationContext {
    private CancellationStrategy strategy;

    public void setStrategy(CancellationStrategy strategy) {
        this.strategy = strategy;
    }

    public void cancelPolicy(String policyId) {
        if (strategy != null) {
            strategy.cancel(policyId);
        } else {
            throw new IllegalStateException("Cancellation strategy not set.");
        }
    }
}


