package com.bank.banking.api.configuration;

import java.util.Random;

public class RandomIdGenerator {
    public Long generateId() {
        // Generate random Long ID
        return Math.abs(new Random().nextLong());
    }
}
