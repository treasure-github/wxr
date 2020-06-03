package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.mapper.ApplicationMapper;
import com.itheima.bos.web.pojo.Application;
import com.itheima.bos.web.pojo.ApplicationExample;
import com.itheima.bos.web.service.XZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class XZServiceImpl implements XZService {
    @Autowired
    ApplicationMapper applicationMapper;
    /**
     * 查看所有应聘人员的信息
     */
    public List<Application> findAllInfo() {
        ApplicationExample example = new ApplicationExample();
        List<Application> list = applicationMapper.selectByExample(example);
        return list;
    }
    /**
     * 删除选中应聘人，删除对应的人
     */
    public int deleteApplicationById(String[] split){
        int row =1;
        for (String s : split) {
            row = applicationMapper.deleteByPrimaryKey(s);
        }
        return row;
    }
    /**
     * 添加一个应聘人员
     */
    public int saveApplication(Application application){
        int row = applicationMapper.insert(application);
        return row;
    }


}
