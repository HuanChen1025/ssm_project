package com.lin.util;

import java.util.List;

import com.lin.dto.BaseEntity;

public class TransResult<T> extends BaseEntity {
	
	/*serialVersionUID*/
	private static final long serialVersionUID = 1L;

	private List<T> dataList;//数据

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
