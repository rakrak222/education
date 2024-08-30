package com.newlecture.web.class8th.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MenuView {
    private long id;
    private String korName;
    private String engName;
    private long price;

    private Date regDate;
    private long categoryId;
    private long regMemberId;

    private String img;
    private String categoryName;

}
