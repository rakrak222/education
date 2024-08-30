package com.newlecture.web.class8th.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Menu {
    private long id;
    private String korName;
    private String engName;
    private long price;
    private String img;
    private Date regDate;
    private long categoryId;
    private long regMemberId;
}
