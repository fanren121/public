package com.company.dao;

import java.util.List;

import com.company.pojo.Log;

/**
 * @author rjw
 * @category 工作日志
 *
 */
public interface ILogDao {
	/**
	 * 查询所有日志
	 * @return
	 */
	public List<Log> findAll();
	
	/**
	 * 通过Uid查询出该用户所有日志
	 * @param Uid
	 * @return
	 */
	public List<Log> findByUid(int Uid);
	
	/**
	 * 查询日志
	 * @param id
	 * @return
	 */
	public Log findById(int id);
}
