package dev.jhonis.ecommerce.checkout.config;

import dev.jhonis.ecommerce.checkout.streaming.CheckoutCreatedSource;
import dev.jhonis.ecommerce.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
