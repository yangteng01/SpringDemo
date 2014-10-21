package cn.gyyx.dao;

import java.util.List;

import cn.gyyx.beans.UserInfo;

public interface IUserDao {

	/**
	 * 模糊匹配用户信息
	 * @param account
	 * @return
	 */
	List<UserInfo> getUserList(String account);
		
}
