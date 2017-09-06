package com.lin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.lin.dao.ParaDao;
import com.lin.domain.FormulaInfo;
import com.lin.util.BeanUtil;
import com.lin.util.PagedResult;

/**
 * 功能概要：ParasService实现类
 * 
 * @author chenhuan
 * @since  2017年7月20日 
 */
@Service
public class ParasServiceImpl implements ParasService{
	@Resource
	private ParaDao parasDao;

	//公式表
	@Override
	public List<FormulaInfo> selectFormulaByName(String formulaName) {
		List<FormulaInfo> list = parasDao.selectFormulaByName(formulaName);
		return list;
	}
	
	public PagedResult<FormulaInfo> queryFormulaByPage(String formulaName,Integer pageNo,Integer pageSize ) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(parasDao.selectFormulaByName(formulaName));
		
	}

	@Override
	public FormulaInfo updataFormulaByName(String formulaName) {
		return parasDao.updataFormulaByName(formulaName);
	}
	
	

	
	
	

}
