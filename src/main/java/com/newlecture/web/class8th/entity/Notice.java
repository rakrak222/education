package com.newlecture.web.class8th.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class Notice {

  private long id;
  private String title;
  private String content;
  private Date regDate;
  private Date upadateDate;
  private int hitCount;
  private long regMemberId;


//  @Builder
//  public Notice(String title, String content) {
//    this.title = title;
//    this.content = content;
//  }


}
