package cn.gyyx.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {

	private static SqlSessionFactory sqlSession;
	
	static{
		try{
			String resource = "mybatis/SqlMap.xml";
			Reader reader=Resources.getResourceAsReader(resource);
			if (sqlSession == null) {
				sqlSession = new SqlSessionFactoryBuilder()
						.build(reader, "AccountDB");
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSession() {
		
		return sqlSession;
		
	}
	
}
