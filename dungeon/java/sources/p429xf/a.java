package p429xf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f57669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f57670d;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f57667a = name;
        this.f57668b = z10;
        this.f57670d = -1L;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    public final boolean a() {
        return this.f57668b;
    }

    public final String b() {
        return this.f57667a;
    }

    public final long c() {
        return this.f57670d;
    }

    public final d d() {
        return this.f57669c;
    }

    public final void e(d queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        d dVar = this.f57669c;
        if (dVar == queue) {
            return;
        }
        if (dVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f57669c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f57670d = j10;
    }

    public String toString() {
        return this.f57667a;
    }
}
