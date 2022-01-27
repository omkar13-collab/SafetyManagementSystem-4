package com.Safety.Model;

import java.util.List;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

	@Entity
	@Table(name="inj")
	public class Injury {
	    @NotNull
	    private int userId;
	    @Column(name="username",nullable=false)
	    @NotNull
	    @Size(min=2,message="name should have atleast two character")
	    private String userName;
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int injuryId;
	   @Column(name="injuryInfo",nullable=false)
	   @NotEmpty(message="injuryInfo should not be empty.")
	   private String injuryInfo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getInjuryId() {
		return injuryId;
	}
	public void setInjuryId(int injuryId) {
		this.injuryId = injuryId;
	}
	public String getInjuryInfo() {
		return injuryInfo;
	}
	public void setInjuryInfo(String injuryInfo) {
		this.injuryInfo = injuryInfo;
	}
	@Override
	public String toString() {
		return "Injury [userId=" + userId + ", userName=" + userName + ", injuryId=" + injuryId + ", injuryInfo="
				+ injuryInfo + "]";
	}
	   
	}

