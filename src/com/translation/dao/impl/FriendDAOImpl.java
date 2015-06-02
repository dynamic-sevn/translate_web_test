package com.translation.dao.impl;

import com.translation.bean.Friend;
import com.translation.bean.FriendExample;
import com.translation.dao.FriendDAO;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class FriendDAOImpl extends SqlMapClientDaoSupport implements FriendDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public FriendDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public int countByExample(FriendExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"friend.ibatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public int deleteByExample(FriendExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"friend.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public int deleteByPrimaryKey(Integer friendid) {
		Friend key = new Friend();
		key.setFriendid(friendid);
		int rows = getSqlMapClientTemplate().delete(
				"friend.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public void insert(Friend record) {
		getSqlMapClientTemplate().insert("friend.ibatorgenerated_insert",
				record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public void insertSelective(Friend record) {
		getSqlMapClientTemplate().insert(
				"friend.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public List selectByExample(FriendExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"friend.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public Friend selectByPrimaryKey(Integer friendid) {
		Friend key = new Friend();
		key.setFriendid(friendid);
		Friend record = (Friend) getSqlMapClientTemplate().queryForObject(
				"friend.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public int updateByExampleSelective(Friend record, FriendExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"friend.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public int updateByExample(Friend record, FriendExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"friend.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public int updateByPrimaryKeySelective(Friend record) {
		int rows = getSqlMapClientTemplate().update(
				"friend.ibatorgenerated_updateByPrimaryKeySelective", record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public int updateByPrimaryKey(Friend record) {
		int rows = getSqlMapClientTemplate().update(
				"friend.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table friend
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	private static class UpdateByExampleParms extends FriendExample {
		private Object record;

		public UpdateByExampleParms(Object record, FriendExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}