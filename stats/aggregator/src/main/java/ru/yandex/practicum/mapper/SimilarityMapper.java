package ru.yandex.practicum.mapper;

import lombok.experimental.UtilityClass;
import ru.practicum.ewm.stats.avro.EventSimilarityAvro;

import java.time.Instant;

@UtilityClass
public class SimilarityMapper {
    public EventSimilarityAvro toAvro(Long eventA, Long eventB, double score) {
        long first = Math.min(eventA, eventB);
        long second = Math.max(eventA, eventB);

        return EventSimilarityAvro.newBuilder()
                .setEventA(first)
                .setEventB(second)
                .setScore(score)
                .setTimestamp(Instant.now())
                .build();
    }
}
