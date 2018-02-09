package com.tanwuapp.tanwudemo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志统一输出工具类
 */
public class LogUtils {

    private static Logger logger = LoggerFactory.getLogger(LogUtils.class);

    public static void debug(String msg,Exception e) {
        logger.debug(msg,e);
    }

    public static void info(String msg,Exception e) {
        logger.info(msg,e);
    }

    public static void error(String msg,Exception e) {
        logger.error(msg,e);
    }

    public static void warn(String msg,Exception e) {
        logger.warn(msg,e);
    }
}
