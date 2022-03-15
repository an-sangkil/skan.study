package com.algorithm.bucket;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021/12/17
 */
public abstract class RateLimiter {
    public RateLimiter(int maxRequestPerSec) {
    }

    abstract boolean allow();
}
