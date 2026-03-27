package com.roomrental.backend.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomRequest {
    @NotNull(message = "Landlord ID is required")
    private Long landlordId;

    @NotNull(message = "Category ID is required")
    private Long categoryId;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    @NotNull(message = "Price is required")
    @Positive
    private BigDecimal price;

    @NotBlank(message = "Address is required")
    private String address;

    private String city;
    private String district;
    private String ward;
    private Float area;

    private List<String> imageUrls;
    private List<String> utilities;
}
