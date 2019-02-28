package com.zxl.dao;

import com.zxl.entity.Breeds;
import com.zxl.entity.BreedsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BreedsMapper {
    int countByExample(BreedsExample example);

    int deleteByExample(BreedsExample example);

    int deleteByPrimaryKey(Integer breid);

    int insert(Breeds record);

    int insertSelective(Breeds record);

    List<Breeds> selectByExampleWithRowbounds(BreedsExample example, RowBounds rowBounds);

    List<Breeds> selectByExample(BreedsExample example);

    Breeds selectByPrimaryKey(Integer breid);

    int updateByExampleSelective(@Param("record") Breeds record, @Param("example") BreedsExample example);

    int updateByExample(@Param("record") Breeds record, @Param("example") BreedsExample example);

    int updateByPrimaryKeySelective(Breeds record);

    int updateByPrimaryKey(Breeds record);
}