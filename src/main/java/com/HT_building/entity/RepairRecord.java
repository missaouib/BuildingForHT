package com.HT_building.entity;

public class RepairRecord {
	
	private int recordId;
	private int orderId;
	private int userId;
	private int state;        //0表示删除；1表示存在
	private String address;
	private int repairId;
	private int tag;          //1表示工厂；2表示施工方；默认为0
	private int repairState;  //0表示未受理；1表示售后人员上门检查；2表示相关单位维修；3表示维修完成，服务结束
	private String phone;
	private String problem;
	
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRepairId() {
		return repairId;
	}
	public void setRepairId(int repairId) {
		this.repairId = repairId;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getRepairState() {
		return repairState;
	}
	public void setRepairState(int repairState) {
		this.repairState = repairState;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	@Override
	public String toString() {
		return "RepairRecord [recordId=" + recordId + ", orderId=" + orderId + ", userId=" + userId + ", state=" + state
				+ ", address=" + address + ", repairId=" + repairId + ", tag=" + tag + ", repairState=" + repairState
				+ ", phone=" + phone + ", problem=" + problem + "]";
	}

}
