
package com.example.demo.controller;

import com.example.demo.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/cancel")
    public String cancelPolicy(@RequestParam String policyId, @RequestParam String policyType) {
        try {
            policyService.cancelPolicy(policyId, policyType);
            return "Policy " + policyId + " of type " + policyType + " canceled.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/createUser")
    public String createUser(@RequestParam String userName) {
        try {
            policyService.createUser(userName);
            return "User " + userName + " created.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}

