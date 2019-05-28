package pl.piomin.services.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfoController
{

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoController.class);

    @GetMapping("/")
    public String info()
    {
        LOGGER.info("Hit Department info controller");
        return "Department microservice v1.0";
    }
}
