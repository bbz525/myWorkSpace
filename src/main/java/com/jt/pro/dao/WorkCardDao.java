package com.jt.pro.dao;

import com.jt.pro.model.WorkCard;

import java.util.List;

public interface WorkCardDao {
    WorkCard getWorkCardByEmpId(Long empId);
}
