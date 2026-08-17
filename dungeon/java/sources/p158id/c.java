package p158id;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f43983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43984b;

    public c(UUID updateId, long j10) {
        Intrinsics.checkNotNullParameter(updateId, "updateId");
        this.f43983a = updateId;
        this.f43984b = j10;
    }

    public final long a() {
        return this.f43984b;
    }

    public final UUID b() {
        return this.f43983a;
    }
}
