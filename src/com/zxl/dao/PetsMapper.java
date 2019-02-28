package com.zxl.dao;

import com.zxl.entity.Pets;
import com.zxl.entity.PetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PetsMapper {
    int countByExample(PetsExample example);

    int deleteByExample(PetsExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Pets record);

    int insertSelective(Pets record);

    List<Pets> selectByExampleWithBLOBsWithRowbounds(PetsExample example, RowBounds rowBounds);

    List<Pets> selectByExampleWithBLOBs(PetsExample example);

    List<Pets> selectByExampleWithRowbounds(PetsExample example, RowBounds rowBounds);

    List<Pets> selectByExample(PetsExample example);

    Pets selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Pets record, @Param("example") PetsExample example);

    int updateByExampleWithBLOBs(@Param("record") Pets record, @Param("example") PetsExample example);

    int updateByExample(@Param("record") Pets record, @Param("example") PetsExample example);

    int updateByPrimaryKeySelective(Pets record);

    int updateByPrimaryKeyWithBLOBs(Pets record);

    int updateByPrimaryKey(Pets record);
}