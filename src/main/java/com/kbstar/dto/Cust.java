package com.kbstar.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cust {
    @Size(min=4, max=10, message="id는 최소 4개 최대10개입니다.")
    @NotEmpty
    private String id;
    @Size(min=4, max=10, message="id는 최소 4개 최대10개입니다.")
    @NotEmpty(message = "pwd필수")
    private String pwd;
    @NotEmpty(message = "name필수")
    private String name;
}
