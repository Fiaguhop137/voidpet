package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC1991n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f24283a;

    public H(L provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f24283a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1991n
    public void f(InterfaceC1994q source, AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1987j.a.ON_CREATE) {
            source.y().d(this);
            this.f24283a.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
