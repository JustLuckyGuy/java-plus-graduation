package ru.practicum.dto.comment;

import lombok.*;
import ru.practicum.enums.AdminUpdateCommentStatusAction;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AdminUpdateCommentStatusDto {
    private AdminUpdateCommentStatusAction action;
}
