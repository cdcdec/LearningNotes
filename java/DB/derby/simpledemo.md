# simpledemo
```txt
//需要将数据库的derby.jar引入工程中。
package com.derby;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Test {
    private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static String protocol = "jdbc:derby:";
    String dbName = "";

    public static void loadDriver() {
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getDataFromDerby() throws Exception {
        try {
            dbName = System.getProperty("user.dir") + "\\db\\dbs";// user.dir指定了当前的路径
            Connection conn = DriverManager.getConnection(protocol + dbName
                    + ";create=true");
            Statement statement = conn.createStatement();
            statement
                    .execute("create table    t_user ( id int,name varchar(20))");
            statement.execute("insert into t_user values(1,'sinboy')");
            statement.execute("insert into t_user values(2,'Tom')");
            ResultSet resultSet = statement
                    .executeQuery("select * from t_user");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
            }
            conn.close();
            statement.close();
            resultSet.close();
        } catch (SQLException sqle) {
            System.out.println("=====" + sqle.getSQLState());
            String sqlState = sqle.getSQLState();
            switch (sqlState) {
            case "X0Y32":
                // 表已经存在
                System.out.println("数据表已经存在!");
                break;
            default:
                break;
            }

        } finally {
            try {
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("=====" + e.getSQLState()+","+e.getErrorCode());
                String sqlState = e.getSQLState();
                if ("XJ015".equals(sqlState)) {
                    System.out.println("数据库已经关闭!");
                } else {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Test derbyTest = new Test();
        loadDriver();
        derbyTest.getDataFromDerby();
    }
}
```