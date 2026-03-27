package com.roomrental.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "room_utilities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomUtility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column(nullable = false, length = 100)
    private String name;
}
