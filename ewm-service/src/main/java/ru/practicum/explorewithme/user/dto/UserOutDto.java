package ru.practicum.explorewithme.user.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserOutDto {

    private Long id;
    private String email;
    private String name;
}
