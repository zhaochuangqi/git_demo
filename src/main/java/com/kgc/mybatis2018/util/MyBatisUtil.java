package com.kgc.mybatis2018.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {

    private  static SqlSessionFactory factory;

    static {

        try {
            String name = "myBatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(name);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){

        }
    }
    public  static SqlSession  createSqlSession(){
        return factory.openSession(false);
    }
    public  static  void  closeSqlSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}
