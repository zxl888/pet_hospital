package com.zxl.dao;

import com.zxl.entity.Appointments;
import com.zxl.entity.AppointmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppointmentsMapper {
    int countByExample(AppointmentsExample example);

    int deleteByExample(AppointmentsExample example);

    int deleteByPrimaryKey(Integer appid);

    int insert(Appointments record);

    int insertSelective(Appointments record);

    List<Appointments> selectByExampleWithRowbounds(AppointmentsExample example, RowBounds rowBounds);

    List<Appointments> selectByExample(AppointmentsExample example);

    Appointments selectByPrimaryKey(Integer appid);

    int updateByExampleSelective(@Param("record") Appointments record, @Param("example") AppointmentsExample example);

    int updateByExample(@Param("record") Appointments record, @Param("example") AppointmentsExample example);

    int updateByPrimaryKeySelective(Appointments record);

    int updateByPrimaryKey(Appointments record);
}