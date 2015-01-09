package com.summer.dao.core;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * Description: <BR>
 * 
 * @author Robin Wu CreateTime: Mar 21, 2011
 */
public interface IDao<T, E> extends java.io.Serializable {

	/**
	 * 方法说明：<br>
	 * 一条信息插入表
	 * @param t
	 */
	void add(T t);
	
	/**
	 * 方法说明：<br>
	 * 根据主键ID，删除表记录
	 * @param id
	 * @return
	 */
	int deleteById(long id);
	
	/**
	 * 方法说明：<br>
	 * 根据某些条件，删除表记录，自定义写sql
	 * @param e
	 * @return
	 */
	int delete(E e);

	/**
	 * 方法说明：<br>
	 * 修改表信息，以主键为条件
	 * @param t
	 * @return
	 */
	int update(T t);

	/**
	 * 方法说明：<br>
	 * 以主键为条件，获得表一条记录
	 * @param id
	 * @return
	 */
	T getObjectById(long id);

	/**
	 * 方法说明：<br>
	 * 根据某些条件，计算表记录数，自定义写sql
	 * @param e
	 * @return
	 */
	int count(@Param("map")E e);
	
	/**
	 * 方法说明：<br>
	 * 根据某些条件，查询所有符合这些条件的记录
	 * @param t
	 * @return
	 */
	List<T> query(T t);
}
