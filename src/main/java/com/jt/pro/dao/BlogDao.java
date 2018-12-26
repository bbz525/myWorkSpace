package com.jt.pro.dao;

import com.jt.pro.model.Blog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface BlogDao {
    Blog findBlog(Integer id);
    List<Blog> findBlogs(
            @Param("column")
                    String column,
            @Param("seq")
                    String seq);

    int insertBlogs(Blog blog);
    List<Blog> findBlogs2(@Param(value = "title")String title, @Param("rb") RowBounds rb);
}
