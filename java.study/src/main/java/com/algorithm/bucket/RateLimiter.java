package com.algorithm.bucket;

/**
 *
 * @author skan
 * @since 2021/12/17
 */
public abstract class RateLimiter {
    public RateLimiter(int maxRequestPerSec) {
    }

    abstract boolean allow();
}
