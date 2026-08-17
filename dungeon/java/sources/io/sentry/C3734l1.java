package io.sentry;

/* JADX INFO: renamed from: io.sentry.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3734l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f45956a;

    private C3734l1(Class cls) {
        this.f45956a = cls;
    }

    public static C3734l1 a(Class cls) {
        return new C3734l1(cls);
    }

    public Object b() {
        return this.f45956a.getDeclaredConstructor(null).newInstance(null);
    }
}
