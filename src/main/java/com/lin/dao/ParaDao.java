package com.lin.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lin.domain.FormulaInfo;

/**
 * 功能概要：Paras的DAO类
 * 
 * @author chenhuan
 * @since 2017年7月20日
 */
public interface ParaDao {
	
	/**
	 * 
	 * @author chenhuan
	 * @since 2017年7月20日
	 * @param userId
	 * @return 返回数据库中的计算公式列表
	 */ 
	 List<FormulaInfo> selectFormulaByName(@Param("formulaName") String formulaName);
	 
	 
	 /**
	  *  功能： 根据指定名称查找公式，支持模糊查询
	  * @param formulaName
	  * @return
	  * @since 2017年7月20日
	  */
	 FormulaInfo updataFormulaByName(@Param("formulaName") String formulaName);
}
