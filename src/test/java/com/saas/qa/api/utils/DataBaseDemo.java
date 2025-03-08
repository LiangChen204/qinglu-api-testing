package com.saas.qa.api.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 连接数据库取值方法二
public class DataBaseDemo {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String dataName = "common";

        try {
            // 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 建立数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://rm-uf69u326h3nb389j03o.rwlb.rds.aliyuncs.com:3306/"+ dataName, "qinglu", "m3rTQ6XNA043uFSf");

            // 创建 Statement 对象
            statement = connection.createStatement();

            // 执行查询
            String sql = "select * from api_conn where merchant_id = 3";
            resultSet = statement.executeQuery(sql);

            // 处理结果集
            while (resultSet.next()) {
                System.out.println(resultSet.getString("channel_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
