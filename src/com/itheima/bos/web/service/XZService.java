package com.itheima.bos.web.service;

import com.itheima.bos.web.pojo.Application;

import java.util.List;

public interface XZService {
    List<Application> findAllInfo();

    int deleteApplicationById(String[] split);

    int saveApplication(Application application);


}
