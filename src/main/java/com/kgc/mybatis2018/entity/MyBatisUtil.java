package com.kgc.mybatis2018.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory factory;

    static{
        try {
            String resource="mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
            factory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession createSqlSession() {
        return factory.openSession(false);//开启事务控制
    }

    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession!=null) {
            sqlSession.close();
        }
    }
}
