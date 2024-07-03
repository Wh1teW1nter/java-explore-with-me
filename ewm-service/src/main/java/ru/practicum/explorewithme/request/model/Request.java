package ru.practicum.explorewithme.request.model;

import lombok.*;
import ru.practicum.explorewithme.event.model.Event;
import ru.practicum.explorewithme.user.model.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "requester_id", nullable = false)
    private User requester;
    @Enumerated(value = EnumType.STRING)
    private RequestStatus status;
}
