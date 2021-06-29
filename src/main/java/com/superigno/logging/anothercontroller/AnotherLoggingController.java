/**
 * 
 */
package com.superigno.logging.anothercontroller;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gino.q
 *
 */
@RestController
public class AnotherLoggingController {

    Logger logger = LoggerFactory.getLogger(AnotherLoggingController.class);

    @RequestMapping("/another")
    public String index() {
    	
    	ThreadContext.put("username","admin");
    	
    	this.logger.trace("Another TRACE Message");
        this.logger.debug("Another DEBUG Message");
        this.logger.info("Another INFO Message");
        this.logger.warn("Another WARN Message");
        this.logger.error("Another ERROR Message");
        
        ThreadContext.clearMap();

        return "Howdy! Check out the Logs to see the output...";
    }
}
