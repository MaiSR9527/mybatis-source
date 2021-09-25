package com.msr.batter;

import com.msr.batter.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-24 22:06:43
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // 1.读取配置文件，字节输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        // 2.解析XML配置文件，封装成Configuration对象，创建DefaultSqlSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 3.生成DefaultDefaultSqlSession对象，默认事务不会自动提交，完成Executor对象的创建(执行器的创建)
        SqlSession sqlSession = sessionFactory.openSession();
        // 4.使用JDK动态代理对mapper接口产生代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.findAll();
    }

    private static void tranditionalXML() throws IOException {
        // 1.读取配置文件，字节输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        // 2.解析XML配置文件，封装成Configuration对象，创建DefaultSqlSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 3.生成DefaultDefaultSqlSession对象，默认事务不会自动提交，完成Executor对象的创建(执行器的创建)
        SqlSession sqlSession = sessionFactory.openSession();

        // 4.1 根据statementId来从configuration中的map集合中获取对应的MappedStatement
        // 4.2 将执行查询操作委派给Executor
        List<Object> objects = sqlSession.selectList("namespace.id");
    }
}
