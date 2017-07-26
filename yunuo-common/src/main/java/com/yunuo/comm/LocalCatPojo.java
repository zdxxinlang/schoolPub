package com.yunuo.comm;

public class LocalCatPojo {

	private String id ; //区域id
    private String text ; // 区域名称
   // private String parentID ; // 父级id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "LocalCatPojo [id=" + id + ", text=" + text + "]";
	}
	
	
//	public String getParentID() {
//		return parentID;
//	}
//	public void setParentID(String parentID) {
//		this.parentID = parentID;
//	}
//	@Override
//	public String toString() {
//		return "LocalCatPojo [areaID=" + areaID + ", areaName=" + areaName
//				+ ", parentID=" + parentID + "]";
//	}
    
    
}
