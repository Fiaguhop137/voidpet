package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3721i3 implements B0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* JADX INFO: renamed from: io.sentry.i3$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3721i3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            return EnumC3721i3.valueOf(interfaceC3724j1.j2().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.B0
    public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
        interfaceC3729k1.e(name().toLowerCase(Locale.ROOT));
    }
}
