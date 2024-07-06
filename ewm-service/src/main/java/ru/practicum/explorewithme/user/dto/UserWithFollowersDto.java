package ru.practicum.explorewithme.user.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserWithFollowersDto {

    private Long id;
    private String email;
    private String name;
    private List<UserOutDto> followers;
}
