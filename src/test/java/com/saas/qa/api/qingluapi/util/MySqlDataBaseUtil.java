package com.saas.qa.api.qingluapi.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

// 连接数据库取值方法一
public class MySqlDataBaseUtil {
    public static void main(String[] args) {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String dataBaseName = "common";
        try {
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://rm-uf69u326h3nb389j03o.rwlb.rds.aliyuncs.com:3306/" + dataBaseName + "?useSSL=false&serverTimezone=UTC");
            dataSource.setUser("qinglu");
            dataSource.setPassword("m3rTQ6XNA043uFSf");
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            String sql = "select * from api_conn where merchant_id = 3";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("channel_id"));
            }
//            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try{
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
