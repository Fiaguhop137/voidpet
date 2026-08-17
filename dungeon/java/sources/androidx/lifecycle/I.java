package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC1991n, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f24285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24286c;

    public I(String key, G handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f24284a = key;
        this.f24285b = handle;
    }

    public final void a(p237n3.f registry, AbstractC1987j lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f24286c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f24286c = true;
        lifecycle.a(this);
        registry.c(this.f24284a, this.f24285b.a());
    }

    public final G b() {
        return this.f24285b;
    }

    public final boolean c() {
        return this.f24286c;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.InterfaceC1991n
    public void f(InterfaceC1994q source, AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1987j.a.ON_DESTROY) {
            this.f24286c = false;
            source.y().d(this);
        }
    }
}
