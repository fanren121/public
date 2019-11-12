package com.company.pojo;

import java.sql.Date;

/**
 * @author Vimi
 * @category 日志实体类
 */
public class Log {
	
	/**
	 * 日志id
	 */
	private int id;
	
	/**
	 * 用户id
	 */
	private int uid;
	
	/**
	 * 日志内容
	 */
	private String content;
	
	/**
	 * 日志时间
	 */
	private Date datetime;

	public Log() {
		super();
	}

	public Log(int id, int uid, String content, Date datetime) {
		super();
		this.id = id;
		this.uid = uid;
		this.content = content;
		this.datetime = datetime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}
