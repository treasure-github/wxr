package com.itheima.bos.web.utils;

import java.util.UUID;

public class GetUUID {


    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
