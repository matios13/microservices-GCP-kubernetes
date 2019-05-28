package pl.piomin.services.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piomin.services.employee.repository.EmployeeRepository;


@RestController
public class InfoController
{

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoController.class);

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/")
    public String info()
    {
        LOGGER.info("Hit employee info controller");
        return "Employee microservice v1.0";
    }
}
