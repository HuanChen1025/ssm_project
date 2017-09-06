package com.lin.domain;

public class FormulaInfo {
	
	private String name;
	private  String content;
	private String des;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "FormulaInfo [name=" + name + ", content=" + content + ", des="
				+ des + "]";
	}
	
	

}
