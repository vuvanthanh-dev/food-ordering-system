package com.thanhvv.food.ordering.system.order.service.domain.dto.track;

import com.thanhvv.food.ordering.system.domain.valueobject.OrderStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderResponse {
    @NotNull
    private UUID orderTrackingId;
    @NotNull
    private OrderStatus orderStatus;
    List<String> failureMessages;
}
