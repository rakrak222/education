package com.newlecture.web.class8th.repository;

import com.newlecture.web.class8th.entity.Notice;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.sql.Statement;


@Repository
public class JdbcNoticeRepository implements NoticeRepository{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@//hi.newlecture.com:1521/XEPDB1";
        String sql = "SELECT * FROM MEMBER";

        Connection conn = DriverManager.getConnection(url,"rland","0530");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        for(int i=0; i<3; i++){
            rs.next();

            int id = rs.getInt(1);
            String username = rs.getString("USERNAME");
            System.out.println(username);
        }


    }
    @Override
    public List findAll() throws SQLException, ClassNotFoundException {

        Class.forName("oracle.jdbc.driver.OracleDriver");
//        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:oracle:thin:@//hi.newlecture.com:1521/XEPDB1";
        String sql = "SELECT * FROM MEMBER";
        Connection conn = DriverManager.getConnection(url,"rland","0530");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next())
        {
            long id = rs.getInt("ID");
            String title = rs.getString("TITLE");
            String content = rs.getString("CONTENT");
            Date regDate = rs.getDate("REG_DATE");
            Date updateDate = rs.getDate("UPDATE_DATE");
            int hitCount = rs.getInt("HIT_COUNT");
            long regMemberId = rs.getLong("REG_MEMBER_ID");

            String username = rs.getString("USERNAME");

            Notice notice = Notice.builder()
                            .id(id)
                            .title(title)
                            .content(content)
                            .regDate(regDate)
                            .upadateDate(updateDate)
                            .hitCount(hitCount)
                            .regMemberId(regMemberId)
                            .build();

//            notice.add(notice);
            System.out.println(notice.toString());
//            Notice notice = new Notice(id,title,content,hitCount);
//
//            notice.setTitle(title);
//            notice.getTitle();
//            notice.add();


        }

        return List.of();
    }
}
