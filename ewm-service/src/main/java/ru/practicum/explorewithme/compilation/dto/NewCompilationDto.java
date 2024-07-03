package ru.practicum.explorewithme.compilation.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Getter 
@Setter 
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class NewCompilationDto {

    private List<Long> events;
    private Boolean pinned;
    @NotBlank
    @Size(min = 1, max = 50, message = "Длина должна быть от 1 до 50 символов")
    private String title;
}
