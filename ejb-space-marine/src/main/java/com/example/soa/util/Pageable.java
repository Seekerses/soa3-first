package com.example.soa.util;

import lombok.Data;

import java.util.List;

@Data
public class Pageable {

    public enum Direction{
        ASC,
        DESC
    }

    @Data
    public class Sort {
        private Direction direction;
        private String field;
    }

    private Long pageNumber;
    private Integer pageSize;
    List<Sort> sorts;
}
