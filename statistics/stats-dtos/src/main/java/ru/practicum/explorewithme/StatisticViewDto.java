package ru.practicum.explorewithme;

<<<<<<< HEAD
import lombok.*;
=======
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
>>>>>>> origin/main_svc

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
