
package com.example.demo.strategy;

public class AutoPolicyCancellation implements CancellationStrategy {
    @Override
    public void cancel(String policyId) {
        System.out.println("Auto policy " + policyId + " canceled.");
    }
}
