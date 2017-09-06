package com.lin.service;

import java.util.List;


import com.lin.domain.FormulaInfo;
import com.lin.util.PagedResult;

/**
 * 功能概要：UserService接口类
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
public interface ParasService {
	
	
	/**
	 * 
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @param userName 查询条件，可为空
	 * @param pageNo 查询条件，可为空，默认取1
	 * @param pageSize 查询条件，可为空，默认取10
	 * @return
	 */
	
	/*
	 * 公式的服务层
	 */
	List<FormulaInfo> selectFormulaByName(String formulaName);
	PagedResult<FormulaInfo> queryFormulaByPage(String userName,Integer pageNo,Integer pageSize);
	
	FormulaInfo updataFormulaByName(String formulaName);

}
