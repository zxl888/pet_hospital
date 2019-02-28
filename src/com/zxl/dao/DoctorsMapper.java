package com.zxl.dao;

import com.zxl.entity.Doctors;
import com.zxl.entity.DoctorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface DoctorsMapper {
    int countByExample(DoctorsExample example);

    int deleteByExample(DoctorsExample example);

    int deleteByPrimaryKey(Integer docid);

    int insert(Doctors record);

    int insertSelective(Doctors record);

    List<Doctors> selectByExampleWithRowbounds(DoctorsExample example, RowBounds rowBounds);

    List<Doctors> selectByExample(DoctorsExample example);

    Doctors selectByPrimaryKey(Integer docid);

    int updateByExampleSelective(@Param("record") Doctors record, @Param("example") DoctorsExample example);

    int updateByExample(@Param("record") Doctors record, @Param("example") DoctorsExample example);

    int updateByPrimaryKeySelective(Doctors record);

    int updateByPrimaryKey(Doctors record);
    
    //通过科室编号查询医生
    @Select("SELECT * FROM doctors WHERE deptId = #{deptid}" )
    List<Doctors> doctorFindByDeptid(@Param("deptid") String deptid);
}