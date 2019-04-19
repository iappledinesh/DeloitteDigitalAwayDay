package com.dinesh.deloitte.code.util;

import com.dinesh.deloitte.code.model.Activity;

/**
 * 
 */
public class ActivityConsolePrinter {

    public static void print(String time, Activity activity){
        System.out.println(time +" "+activity.getName() +" "+ activity.getFriendlyTime());
    }
}
