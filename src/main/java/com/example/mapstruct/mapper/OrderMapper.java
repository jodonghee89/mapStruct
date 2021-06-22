package com.example.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "orderId", target = "orderId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "addr", target = "addr")
    @Mapping(source = "nickname", target = "nickname")
    @Mapping(source = "tel", target = "tel")
    OrderInfoDto entityToDto(Order order);



}
