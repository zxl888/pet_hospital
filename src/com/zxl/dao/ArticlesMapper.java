package com.zxl.dao;

import com.zxl.entity.Articles;
import com.zxl.entity.ArticlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArticlesMapper {
    int countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(Integer artid);

    int insert(Articles record);

    int insertSelective(Articles record);

    List<Articles> selectByExampleWithBLOBsWithRowbounds(ArticlesExample example, RowBounds rowBounds);

    List<Articles> selectByExampleWithBLOBs(ArticlesExample example);

    List<Articles> selectByExampleWithRowbounds(ArticlesExample example, RowBounds rowBounds);

    List<Articles> selectByExample(ArticlesExample example);

    Articles selectByPrimaryKey(Integer artid);

    int updateByExampleSelective(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(Articles record);

    int updateByPrimaryKeyWithBLOBs(Articles record);

    int updateByPrimaryKey(Articles record);
}