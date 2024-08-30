package com.newlecture.web.class8th.controller.admin;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.newlecture.web.class8th.entity.Notice;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import com.newlecture.web.class8th.service.NoticeService;

@Controller
@RequestMapping("/admin/notice")
public class NoticeController {

  @Autowired
  private NoticeService service;

  @GetMapping("list")
//  @ResponseBody
  public String list(
//          HttpServletRequest request,
//          HttpServletResponse response
          @RequestParam(name ="p",defaultValue ="0") Integer page,
          Model model
  ) throws SQLException, ClassNotFoundException {
    int offset = page + 1;
    System.out.println(offset);
    List<Notice> notices = service.getList();
    model.addAttribute("notices", notices);

    String test = "This is a test string";
    model.addAttribute("test", test);

    return "admin/notice/list";
  }
}
