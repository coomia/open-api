package com.shimh.common.util;

public class StringUtil {

    public static boolean isEmpty(String value) {
        if (null == value)
            return true;
        return value.isEmpty();
    }
}
