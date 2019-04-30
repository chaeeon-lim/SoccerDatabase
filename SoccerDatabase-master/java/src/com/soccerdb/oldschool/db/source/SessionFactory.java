package com.soccerdb.oldschool.db.source;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			String resource = "com/soccerdb/oldschool/db/source/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, "development");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			throw new RuntimeException("Problem with loading the configuration file." + e, e);
		}
		
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	
}
