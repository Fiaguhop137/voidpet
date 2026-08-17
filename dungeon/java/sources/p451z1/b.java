package p451z1;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f58379a;

    public b(boolean z10) {
        this.f58379a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f58379a.get();
    }

    public final void b(boolean z10) {
        this.f58379a.set(z10);
    }
}
