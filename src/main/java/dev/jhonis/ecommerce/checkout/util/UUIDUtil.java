package dev.jhonis.ecommerce.checkout.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDUtil {
    public String createUUID() {
        return UUID.randomUUID().toString();
    }
}
