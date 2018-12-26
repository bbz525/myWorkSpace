package com.jt.pro;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class MyTypeHandler extends BaseTypeHandler<String> {

    Logger log =Logger.getLogger(MyTypeHandler.class.getName());


    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        log.info("设置string的参数【"+parameter+"】");
        ps.setString(i,parameter);

    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String string = rs.getString(columnName);
        log.info("读取string的参数1：【"+string+"】");
        return string;
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String string = rs.getString(columnIndex);
        log.info("读取string的参数2：【"+string+"】");
        return string;
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String string = cs.getString(columnIndex);
        log.info("读取string的参数3：【"+string+"】");
        return string;
    }
}
