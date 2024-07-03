package ru.practicum.explorewithme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.practicum.explorewithme.StatisticViewDto;
import ru.practicum.explorewithme.model.Statistic;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StatisticRepository extends JpaRepository<Statistic, Long> {

    @Query("SELECT new ru.practicum.explorewithme.StatisticViewDto(s.app, s.uri, COUNT (s.ip)) " +
            "FROM Statistic AS s " +
            "WHERE s.timestamp BETWEEN :start AND :end " +
            "GROUP BY s.app, s.uri " +
            "ORDER BY COUNT (s.ip) DESC")
    List<StatisticViewDto> findAllStatisticsByTime(@Param("start") LocalDateTime start,
                                                   @Param("end") LocalDateTime end);

    @Query("SELECT new ru.practicum.explorewithme.StatisticViewDto(s.app, s.uri, COUNT (DISTINCT s.ip)) " +
            "FROM Statistic AS s " +
            "WHERE s.timestamp BETWEEN :start AND :end " +
            "GROUP BY s.app, s.uri " +
            "ORDER BY COUNT (s.ip) DESC")
    List<StatisticViewDto> findAllStatisticsByTimeAndUniqueIp(@Param("start") LocalDateTime start,
                                                              @Param("end") LocalDateTime end);

    @Query("SELECT new ru.practicum.explorewithme.StatisticViewDto(s.app, s.uri, COUNT (DISTINCT s.ip)) " +
            "FROM Statistic AS s " +
            "WHERE s.timestamp BETWEEN :start AND :end AND s.uri IN :uris " +
            "GROUP BY s.app, s.uri " +
            "ORDER BY COUNT (s.ip) DESC")
    List<StatisticViewDto> findAllStatisticsByTimeAndListOfUrisAndUniqueIp(@Param("start") LocalDateTime start,
                                                                           @Param("end") LocalDateTime end,
                                                                           @Param("uris") List<String> uris);

    @Query("SELECT new ru.practicum.explorewithme.StatisticViewDto(s.app, s.uri, COUNT (s.ip)) " +
            "FROM Statistic AS s " +
            "WHERE s.timestamp BETWEEN :start AND :end AND s.uri IN :uris " +
            "GROUP BY s.app, s.uri " +
            "ORDER BY COUNT (s.ip) DESC")
    List<StatisticViewDto> findAllStatisticsByTimeAndListOfUris(@Param("start") LocalDateTime start,
                                                                @Param("end") LocalDateTime end,
                                                                @Param("uris") List<String> uris);
}
