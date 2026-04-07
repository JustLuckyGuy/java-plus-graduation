package ru.practicum.dto.request;

import lombok.*;
import ru.practicum.enums.RequestStatus;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EventRequestStatusUpdateRequest {
    private List<Long> requestIds;

    private RequestStatus status;
}
