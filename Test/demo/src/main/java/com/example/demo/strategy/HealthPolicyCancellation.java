
package com.example.demo.strategy;

public class HealthPolicyCancellation implements CancellationStrategy {
    @Override
    public void cancel(String policyId) {
        System.out.println("Health policy " + policyId + " canceled.");
    }
}

