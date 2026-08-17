package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public enum a4 implements B0 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a4 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            return a4.valueOf(interfaceC3724j1.j2().toUpperCase(Locale.ROOT));
        }
    }

    a4(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    a4(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }

    @Nullable
    public static a4 fromApiNameSafely(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public static a4 fromHttpStatusCode(int i10) {
        for (a4 a4Var : values()) {
            if (a4Var.matches(i10)) {
                return a4Var;
            }
        }
        return null;
    }

    @NotNull
    public static a4 fromHttpStatusCode(@Nullable Integer num, @NotNull a4 a4Var) {
        a4 a4VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : a4Var;
        return a4VarFromHttpStatusCode != null ? a4VarFromHttpStatusCode : a4Var;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.B0
    public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
        interfaceC3729k1.e(apiName());
    }
}
