package com.yogi.data.connection;
//dada 1
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
// deleted at server
//issue 53 commit
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
