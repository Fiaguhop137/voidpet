package io.sentry;

import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3771q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3775r2 f46316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable f46317b;

    public C3771q2(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar, T2 t10) {
        io.sentry.util.w.c(t10, "SentryEnvelopeItem is required.");
        this.f46316a = new C3775r2(xVar, rVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(t10);
        this.f46317b = arrayList;
    }

    public C3771q2(C3775r2 c3775r2, Iterable iterable) {
        this.f46316a = (C3775r2) io.sentry.util.w.c(c3775r2, "SentryEnvelopeHeader is required.");
        this.f46317b = (Iterable) io.sentry.util.w.c(iterable, "SentryEnvelope items are required.");
    }

    public static C3771q2 a(InterfaceC3703f0 interfaceC3703f0, O3 o10, io.sentry.protocol.r rVar) {
        io.sentry.util.w.c(interfaceC3703f0, "Serializer is required.");
        io.sentry.util.w.c(o10, "session is required.");
        return new C3771q2(null, rVar, T2.K(interfaceC3703f0, o10));
    }

    public C3775r2 b() {
        return this.f46316a;
    }

    public Iterable c() {
        return this.f46317b;
    }
}
