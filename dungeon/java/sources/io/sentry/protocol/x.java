package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f46302b = new x("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.p f46303a;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            return new x(interfaceC3724j1.j2());
        }
    }

    public x() {
        this((UUID) null);
    }

    public x(String str) {
        String strE = io.sentry.util.D.e(str);
        if (strE.length() != 32 && strE.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strE.length() == 36) {
            this.f46303a = new io.sentry.util.p(new v(this, strE));
        } else {
            this.f46303a = new io.sentry.util.p(new w(strE));
        }
    }

    public x(UUID uuid) {
        if (uuid != null) {
            this.f46303a = new io.sentry.util.p(new t(this, uuid));
        } else {
            this.f46303a = new io.sentry.util.p(new u());
        }
    }

    public static /* synthetic */ String a(x xVar, UUID uuid) {
        xVar.getClass();
        return xVar.d(io.sentry.util.J.c(uuid));
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return io.sentry.util.D.e(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f46303a.a()).equals(((x) obj).f46303a.a());
    }

    public int hashCode() {
        return ((String) this.f46303a.a()).hashCode();
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.e(toString());
    }

    public String toString() {
        return (String) this.f46303a.a();
    }
}
