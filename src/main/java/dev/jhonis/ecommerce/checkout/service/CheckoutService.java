package dev.jhonis.ecommerce.checkout.service;

import dev.jhonis.ecommerce.checkout.entity.CheckoutEntity;
import dev.jhonis.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
