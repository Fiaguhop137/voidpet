package io.sentry;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class Y3 implements B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y3 f44537b = new Y3("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.p f44538a;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Y3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            return new Y3(interfaceC3724j1.j2());
        }
    }

    public Y3() {
        this.f44538a = new io.sentry.util.p(new W3());
    }

    public Y3(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f44538a = new io.sentry.util.p(new X3(str));
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y3.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f44538a.a()).equals(((Y3) obj).f44538a.a());
    }

    public int hashCode() {
        return ((String) this.f44538a.a()).hashCode();
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.e((String) this.f44538a.a());
    }

    public String toString() {
        return (String) this.f44538a.a();
    }
}
