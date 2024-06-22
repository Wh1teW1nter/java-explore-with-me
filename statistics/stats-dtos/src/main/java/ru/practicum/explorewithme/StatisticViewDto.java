package ru.practicum.explorewithme;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class StatisticViewDto {

    private String app;
    private String uri;
    private long hits;
}
