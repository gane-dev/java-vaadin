package com.example.vaadindemo;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public interface ILoadLogDao {
    public void setDataSource(DataSource dataSource);
    public List<LoadLog> getList();
}
