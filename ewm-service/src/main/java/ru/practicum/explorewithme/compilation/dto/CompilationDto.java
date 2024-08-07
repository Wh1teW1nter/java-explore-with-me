package ru.practicum.explorewithme.compilation.dto;

import lombok.*;
import ru.practicum.explorewithme.event.dto.EventShortDto;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompilationDto {

    private Long id;
    private List<EventShortDto> events;
    private Boolean pinned;
    private String title;
}
