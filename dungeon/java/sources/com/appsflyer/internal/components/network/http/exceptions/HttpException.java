package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1aSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1aSDK getMonetizationNetwork;

    public HttpException(@NonNull Throwable th, @NonNull AFd1aSDK aFd1aSDK) {
        super(th.getMessage(), th);
        this.getMonetizationNetwork = aFd1aSDK;
    }

    @NonNull
    public AFd1aSDK getMetrics() {
        return this.getMonetizationNetwork;
    }
}
