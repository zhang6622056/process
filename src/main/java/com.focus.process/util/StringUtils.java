package com.focus.process.util;

/**
 *
 * Created by Nero on 2019-01-11.
 */
public class StringUtils {


    public static boolean isBlank(String s){
        return (null == s || !s.trim().equals(""));
    }



}
