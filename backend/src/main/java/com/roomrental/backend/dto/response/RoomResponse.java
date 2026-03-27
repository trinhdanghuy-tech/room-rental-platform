package com.roomrental.backend.dto.response;

import com.roomrental.backend.entity.enums.RoomStatus;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomResponse {
    private Long id;
    private Long landlordId;
    private String landlordName;
    private String categoryName;
    private String title;
    private String description;
    private BigDecimal price;
    private String address;
    private String city;
    private String district;
    private String ward;
    private Float area;
    private RoomStatus status;
    private List<String> imageUrls;
    private List<String> utilities;
}
