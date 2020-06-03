package com.itheima.bos.web.service.Impl;

import com.itheima.bos.web.mapper.SumnoMapper;
import com.itheima.bos.web.pojo.Sumno;
import com.itheima.bos.web.pojo.SumnoExample;
import com.itheima.bos.web.service.SumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SumnoServiceImpl implements SumnoService {

    @Autowired
    SumnoMapper sumnoMapper;

    @Override
    public Sumno findSumno() {
        SumnoExample example = new SumnoExample();
        List<Sumno> sumnos = sumnoMapper.selectByExample(example);
        if (sumnos!=null){
            Sumno sumno = sumnos.get(0);
            int printno = Integer.parseInt(sumno.getPrintorderno());
            printno++;
            sumno.setPrintorderno(printno+"");
            //将新的打印订单信息重新录入库
            SumnoExample example1 = new SumnoExample();
            SumnoExample.Criteria criteria = example.createCriteria();
            printno--;
            criteria.andOrdernoEqualTo(printno+"");
            sumnoMapper.updateByExample(sumno,example1);
            return sumnos.get(0);
        }
        return null;
    }
}
