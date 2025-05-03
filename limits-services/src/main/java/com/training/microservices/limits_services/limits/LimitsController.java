package com.training.microservices.limits_services.limits;

import com.training.microservices.limits_services.beans.Limits;
import com.training.microservices.limits_services.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimits(){

        return new Limits(configuration.getMinimum(), configuration.getMaximum());

    }
}
