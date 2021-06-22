package com.example.mapstruct.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class OrderInfoDto {
    private Long orderId;
    private String name;
    private String addr;
    private String nickname;
    private String tel;
}
