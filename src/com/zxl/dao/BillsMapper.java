package com.zxl.dao;

import com.zxl.entity.Bills;
import com.zxl.entity.BillsExample;
import com.zxl.entity.Pets;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface BillsMapper {
    int countByExample(BillsExample example);

    int deleteByExample(BillsExample example);

    int deleteByPrimaryKey(Integer billid);

    int insert(Bills record);

    int insertSelective(Bills record);

    List<Bills> selectByExampleWithRowbounds(BillsExample example, RowBounds rowBounds);

    List<Bills> selectByExample(BillsExample example);

    Bills selectByPrimaryKey(Integer billid);

    int updateByExampleSelective(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByExample(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);
    
    //自定义 bill
    //根据宠物编号查询订单数量
    @Select("SELECT count(*) from bills where petId=#{pets.pid}")
    int countByPId(@Param("pets") Pets pets);
    
    //根据身份证号查询订单
    @Select("SELECT b.billId,b.payStatus,b.billCreateTime,b.petId,p.pName,p.pOwner,p.ownerTel FROM bills b LEFT JOIN pets p ON b.petId = p.pid where pOIdCard = #{pets.poidcard}")
    List<Map<String,Object>> selectByPOIdCard(@Param("pets") Pets pets);
    
    //根据订单编号查询订单
    @Select("SELECT b.billId,b.payStatus,b.billCreateTime,b.petId,p.pName,p.pOwner,p.ownerTel,p.pAge,p.pSex,p.pOIdCard,b.ChinesePrices,b.westermPrices,b.materialPrices,b.exaninePrices,b.registrationPrices,b.OPSPrices,b.totalPrices FROM bills b LEFT JOIN pets p ON b.petId = p.pid where b.billId = #{billId}")
    Map<String,Object> selectByBillId(@Param("billId") int billId);
}