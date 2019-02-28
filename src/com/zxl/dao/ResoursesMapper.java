package com.zxl.dao;

import com.zxl.entity.Resourses;
import com.zxl.entity.ResoursesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ResoursesMapper {
    int countByExample(ResoursesExample example);

    int deleteByExample(ResoursesExample example);

    int deleteByPrimaryKey(Integer reid);

    int insert(Resourses record);

    int insertSelective(Resourses record);

    List<Resourses> selectByExampleWithRowbounds(ResoursesExample example, RowBounds rowBounds);

    List<Resourses> selectByExample(ResoursesExample example);

    Resourses selectByPrimaryKey(Integer reid);

    int updateByExampleSelective(@Param("record") Resourses record, @Param("example") ResoursesExample example);

    int updateByExample(@Param("record") Resourses record, @Param("example") ResoursesExample example);

    int updateByPrimaryKeySelective(Resourses record);

    int updateByPrimaryKey(Resourses record);
}