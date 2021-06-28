/**
 * 
 */
package com.superigno.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gino.q
 *
 */
@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        this.logger.trace("A TRACE Message");
        this.logger.debug("A DEBUG Message");
        this.logger.info("An INFO Message");
        this.logger.warn("A WARN Message");
        this.logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}
