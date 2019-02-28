package com.zxl.dao;

import com.zxl.entity.Schedules;
import com.zxl.entity.SchedulesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface SchedulesMapper {
	int countByExample(SchedulesExample example);

	int deleteByExample(SchedulesExample example);

	int deleteByPrimaryKey(Integer scid);

	int insert(Schedules record);

	int insertSelective(Schedules record);

	List<Schedules> selectByExampleWithRowbounds(SchedulesExample example, RowBounds rowBounds);

	List<Schedules> selectByExample(SchedulesExample example);

	Schedules selectByPrimaryKey(Integer scid);

	int updateByExampleSelective(@Param("record") Schedules record, @Param("example") SchedulesExample example);

	int updateByExample(@Param("record") Schedules record, @Param("example") SchedulesExample example);

	int updateByPrimaryKeySelective(Schedules record);

	int updateByPrimaryKey(Schedules record);

	// 自定义
	// 预约页面查询排班表和医生表
	@Select("SELECT\r\n" + 
			"	s.*, d.docName\r\n" + 
			"FROM\r\n" + 
			"	schedules s\r\n" + 
			"LEFT JOIN doctors d ON s.docId = d.docId\r\n" + 
			"WHERE\r\n" + 
			"	(#{docId} IS NULL OR s.docId = #{docId})\r\n" + 
			"AND (#{deptId} IS NULL OR s.deptId = #{deptId})\r\n" + 
			"AND duty BETWEEN curdate()\r\n" + 
			"AND date_add(curdate(), INTERVAL 1 WEEK);")
	List<Map<String, Object>> selectSchDoc(@Param("deptId") String deptId, @Param("docId") String docId);
}