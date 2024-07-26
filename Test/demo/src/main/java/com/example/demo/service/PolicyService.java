package com.example.demo.service;

import com.example.demo.singleton.LogManager;
import com.example.demo.strategy.CancellationContext;
import com.example.demo.strategy.HealthPolicyCancellation;
import com.example.demo.strategy.AutoPolicyCancellation;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
    private final CancellationContext cancellationContext = new CancellationContext();

    public void cancelPolicy(String policyId, String policyType) {
        // 去除policyType的前后空白字符
        policyType = policyType.trim();

        System.out.println("Received policyType: " + policyType);
        System.out.println("Received policyType length: " + policyType.length());

        switch (policyType.toLowerCase()) {
            case "health":
                System.out.println("Using HealthPolicyCancellation strategy");
                cancellationContext.setStrategy(new HealthPolicyCancellation());
                break;
            case "auto":
                System.out.println("Using AutoPolicyCancellation strategy");
                cancellationContext.setStrategy(new AutoPolicyCancellation());
                break;
            default:
                System.out.println("Invalid policy type received: " + policyType);
                throw new IllegalArgumentException("Invalid policy type: " + policyType);
        }

        System.out.println("Strategy set, now canceling policy...");
        cancellationContext.cancelPolicy(policyId);
        LogManager.getInstance().log("Policy " + policyId + " has been canceled with type " + policyType + ".");
    }

    public void createUser(String userName) {
        LogManager.getInstance().log("User " + userName + " has been created.");
    }
}
