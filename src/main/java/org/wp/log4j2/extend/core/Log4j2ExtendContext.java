/*
 * Copyright © 2024 By wang-p,All rights reserved.
 */
package org.wp.log4j2.extend.core;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.message.MessageFactory;

import java.net.URI;

/**
 * @author wang-p
 * @version 1.0.0
 * @class Log4j2ExtendContext
 * @desc
 * @date 2024/5/5
 * @modify
 */
public class Log4j2ExtendContext extends LoggerContext {

    public Log4j2ExtendContext(String name) {
        super(name);
    }

    public Log4j2ExtendContext(String name, Object externalContext) {
        super(name, externalContext);
    }

    public Log4j2ExtendContext(String name, Object externalContext, URI configLocn) {
        super(name, externalContext, configLocn);
    }

    public Log4j2ExtendContext(String name, Object externalContext, String configLocn) {
        super(name, externalContext, configLocn);
    }

    @Override
    protected Logger newInstance(LoggerContext ctx, String name, MessageFactory messageFactory) {
        return new Log4j2ExtendLogger(ctx, name, messageFactory);
    }
}
