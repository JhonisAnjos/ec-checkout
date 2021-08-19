package dev.jhonis.ecommerce.checkout.listener;

import dev.jhonis.ecommerce.checkout.entity.CheckoutEntity;
import dev.jhonis.ecommerce.checkout.service.CheckoutService;
import dev.jhonis.ecommerce.checkout.streaming.PaymentPaidSink;
import dev.jhonis.ecommerce.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
