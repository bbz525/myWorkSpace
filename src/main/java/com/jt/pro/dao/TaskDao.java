package com.jt.pro.dao;

import com.jt.pro.model.Task;

import java.util.List;

public interface TaskDao {
    List<Task> findTask(int id);
}
