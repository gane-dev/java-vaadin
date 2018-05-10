package com.example.vaadindemo;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class LoadLogDao implements  ILoadLogDao{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    //private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<LoadLog> getList() {

        return this.namedParameterJdbcTemplate.query("select * from load_log where rownum < 10",
                new RowMapper<LoadLog>() {
                    @Override
                    public LoadLog mapRow(ResultSet resultSet, int i) throws SQLException {
                        LoadLog log = new LoadLog();
                        log.setLOAD_FINISH(resultSet.getDate("LOAD_FINISH"));
                        log.setLOAD_START(resultSet.getDate("LOAD_START"));
                        log.setLOAD_NUM(resultSet.getInt("LOAD_NUM"));
                        log.setMODULE_NAME(resultSet.getString("MODULE_NAME"));
                        log.setROWS_PROCESSED(resultSet.getInt("ROWS_PROCESSED"));
                        log.setSTATUS(resultSet.getString("STATUS"));
                        log.setSTEP(resultSet.getString("STEP"));

                        return log;
                    }
                });
    }
}
