package p183k3;

import kotlin.jvm.internal.Intrinsics;
import p291q3.h;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.c f47845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f47846b;

    public e(h.c delegate, c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f47845a = delegate;
        this.f47846b = autoCloser;
    }

    @Override // q3.h.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new d(this.f47845a.a(configuration), this.f47846b);
    }
}
