package com.roomrental.backend.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingRequest {
    @NotNull(message = "Tenant ID is required")
    private Long tenantId;

    @NotNull(message = "Room ID is required")
    private Long roomId;

    @FutureOrPresent
    private LocalDate checkInDate;

    @Future
    private LocalDate checkOutDate;
}
