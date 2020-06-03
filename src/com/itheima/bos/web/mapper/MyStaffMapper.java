package com.itheima.bos.web.mapper;

import com.itheima.bos.web.pojo.Staff;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface MyStaffMapper {
    Staff findUserByUsername(String username);
}
