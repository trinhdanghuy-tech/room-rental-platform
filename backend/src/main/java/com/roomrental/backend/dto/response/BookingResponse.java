package com.roomrental.backend.dto.response;

import com.roomrental.backend.entity.enums.BookingStatus;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingResponse {
    private Long id;
    private Long tenantId;
    private String tenantName;
    private Long roomId;
    private String roomTitle;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private BigDecimal totalPrice;
    private BookingStatus status;
    private LocalDateTime createdAt;
}
