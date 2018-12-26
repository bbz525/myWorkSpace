package com.jt;

import com.jt.pro.dao.BlogDao;
import com.jt.pro.model.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    private SqlSessionFactory factory;
    private Logger log = Logger.getLogger(AppTest.class.getName());
    @Before
    public void init()
    {
        try {
            factory =new SqlSessionFactoryBuilder() .build(
                    Resources.getResourceAsStream("mybatis-configs.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test()
    {

        SqlSession sqlSession = factory.openSession();
        BlogDao mapper = sqlSession.getMapper(BlogDao.class);

        List<Blog> blogs = mapper.findBlogs("content","desc");

        System.out.println(blogs);

        Blog  blog = new Blog();
        blog.setContent("tf...");
        blog.setCreatedTime(new Date());
        blog.setModifiedTime(new Date());
        blog.setTitle("tf");
        mapper.insertBlogs(blog);
        blogs = mapper.findBlogs("content","desc");
        System.out.println("blogs2:"+blogs);
        sqlSession.commit();
        List<Blog> ta = mapper.findBlogs2("ta",new RowBounds(0,2));
        log.info("ta is:【"+ta.toString()+"】");
        sqlSession.close();
    }

}
