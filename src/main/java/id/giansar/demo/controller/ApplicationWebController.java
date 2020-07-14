/*
 * Spring Boot Demo with Thymeleaf and AdminLTE 3
 * https://github.com/giansar/spring-boot-thymeleaf-adminlte-3
 */
package id.giansar.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Giansar
 */
@Controller
public class ApplicationWebController {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationWebController.class);

    @RequestMapping("/")
    public String getIndex(Model model) {
        LOG.info("Index");
        return "index";
    }
}
