package cn.gyyx.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.beans.UserInfo;

public class UserDao {

	public SqlSessionFactory sessionFactory=SessionFactory.getSqlSession();
	
	/**
	 * 模糊匹配用户信息
	 * @param account
	 * @return
	 */
	public List<UserInfo> getUserList(String account){
	
		SqlSession session=sessionFactory.openSession();
		
		try{
			
		IUserDao userDao=session.getMapper(IUserDao.class);
		return userDao.getUserList(account);
		
		}finally{
			
			session.close();
		}
	}
}
