package com.yogi.data.connection;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
// yess  yogi bhai
public class ConnectionFactory {

	private static SqlSessionFactory sqlMapper;
	private static Reader reader; 

	static{
		
		try{
			reader	  = Resources.getResourceAsReader("allconfiguration.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession(){
		return sqlMapper;
	}
}
