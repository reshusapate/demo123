package com.example.demo;

import java.util.Arrays;

public class College {


	 boolean status; 
	 int userId;
	 String emailId;
	 int rollNo;
	int[] arr;
	String[] str;
	
		@Override
	public String toString() {
		return "College [status=" + status + ", userId=" + userId + ", emailId=" + emailId + ", rollNo=" + rollNo
				+ ", arr=" + Arrays.toString(arr) + ", str=" + Arrays.toString(str) + "]";
	}
		public College(boolean status, int userId, String emailId, int rollNo, int[] arr, String[] str) {
		super();
		this.status = status;
		this.userId = userId;
		this.emailId = emailId;
		this.rollNo = rollNo;
		this.arr = arr;
		this.str = str;
	}
		public College() {
			super();
		}
		public College(boolean b, int i, String string, int j, int k, int l, int m, String string2, String string3) {
			// TODO Auto-generated constructor stub
		}
		public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public String[] getStr() {
		return str;
	}
	public void setStr(String[] str) {
		this.str = str;
	}
	
		
	}


