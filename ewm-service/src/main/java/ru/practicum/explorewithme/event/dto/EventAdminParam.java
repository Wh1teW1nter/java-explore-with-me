package ru.practicum.explorewithme.event.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class EventAdminParam {
    private List<Long> users;
    private List<String> states;
    private List<Long> categories;
    private LocalDateTime rangeStart;
    private LocalDateTime rangeEnd;
    private Integer from;
    private Integer size;
}
