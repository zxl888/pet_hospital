package com.zxl.dao;

import com.zxl.entity.Clinics;
import com.zxl.entity.ClinicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClinicsMapper {
    int countByExample(ClinicsExample example);

    int deleteByExample(ClinicsExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Clinics record);

    int insertSelective(Clinics record);

    List<Clinics> selectByExampleWithRowbounds(ClinicsExample example, RowBounds rowBounds);

    List<Clinics> selectByExample(ClinicsExample example);

    Clinics selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Clinics record, @Param("example") ClinicsExample example);

    int updateByExample(@Param("record") Clinics record, @Param("example") ClinicsExample example);

    int updateByPrimaryKeySelective(Clinics record);

    int updateByPrimaryKey(Clinics record);
}