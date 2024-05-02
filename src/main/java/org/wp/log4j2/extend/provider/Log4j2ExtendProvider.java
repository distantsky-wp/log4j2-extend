/*
 * Copyright © 2024 By wang-p,All rights reserved.
 */
package org.wp.log4j2.extend.provider;

import org.apache.logging.log4j.spi.Provider;
import org.wp.log4j2.extend.factory.Log4j2ExtendContextFactory;

/**
 * @author wang-p
 * @version 1.0.0
 * @class Log4j2ExtendProvider
 * @desc
 * @date 2024/5/2
 * @modify
 */
public class Log4j2ExtendProvider extends Provider {

    public Log4j2ExtendProvider() {
        super(100, "2.6.0-extend", Log4j2ExtendContextFactory.class);
    }

}
