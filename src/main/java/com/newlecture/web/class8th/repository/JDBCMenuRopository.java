//package com.newlecture.web.class8th.repository;
//
//import com.newlecture.web.class8th.entity.Menu;
//import com.newlecture.web.class8th.entity.Notice;
//import org.springframework.stereotype.Repository;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//
////@Repository
//public class JDBCMenuRopository implements MenuRepository {
//
////    public static void main(String[] args) {
////        MenuRepository repo = new JDBCMenuRopository();
////        List<Menu> list = repo.findAll();
////        System.out.println(list);
////    }
//
//    @Override
//    public List<Menu> findAll() {
//
//        List<Menu> menus = new ArrayList<Menu>();
//
//        String url = "jdbc:oracle:thin:@//hi.newlecture.com:1521/XEPDB1";
//        String sql = "SELECT * FROM MENU";
//
//        try {
////            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection conn = DriverManager.getConnection(url, "rland", "0530");
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//
//
////        Class.forName("org.mariadb.jdbc.Driver");
//
//        while (rs.next()) {
//            long id = rs.getLong("ID");
//            String korName = rs.getString("KOR_NAME");
//            String engName = rs.getString("ENG_NAME");
//            long price = rs.getLong("PRICE");
//            String img = rs.getString("IMG");
//            Date regDate = rs.getDate("REG_DATE");
//            long categoryId = rs.getLong("CATEGORY_ID");
//            long regMemberId = rs.getLong("REG_MEMBER_ID");
//
//
//            Menu menu = Menu.builder()
//                    .id(id)
//                    .korName(korName)
//                    .engName(engName)
//                    .price(price)
//                    .img(img)
//                    .regDate(regDate)
//                    .categoryId(categoryId)
//                    .regMemberId(regMemberId)
//                    .build();
//
//            menus.add(menu);
//        }
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
////            throw new RuntimeException(e);
//
//        }
//
//        return menus;
//    }
//
//    @Override
//    public List<Menu> findAll(Integer CategoryId) {
//        return List.of();
//    }
//}
//
