package ru.practicum.explorewithme.compilation.dto;

import lombok.*;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.List;

@Getter 
@Setter 
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCompilationRequest {

    private List<Long> events;
    private Boolean pinned;
    @Size(min = 1, max = 50, message = "Длина должна быть от 1 до 50 символов")
    private String title;
}
