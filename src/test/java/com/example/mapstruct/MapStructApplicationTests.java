package com.example.mapstruct;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.mapstruct.mapper.Order;
import com.example.mapstruct.mapper.OrderInfoDto;
import com.example.mapstruct.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapStructApplicationTests {

    @Test
    void contextLoads() {

        Order of = Order.of();
        OrderInfoDto orderInfoDto = OrderMapper.INSTANCE.entityToDto(of);
        assertThat(of.getAddr()).isEqualTo("seoul");
        assertThat(of.getName().equals(orderInfoDto.getName())).isEqualTo(true);
    }

}
