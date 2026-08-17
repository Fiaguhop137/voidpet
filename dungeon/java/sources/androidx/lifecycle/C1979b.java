package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1979b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f24329a;

    public C1979b(Object obj) {
        this.f24329a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return p359u.G.a(this.f24329a, obj, obj2);
    }

    public final Object b() {
        return this.f24329a.get();
    }
}
