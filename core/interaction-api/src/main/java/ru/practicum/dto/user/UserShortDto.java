package ru.practicum.dto.user;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserShortDto {
    private Long id;
    private String name;
}
