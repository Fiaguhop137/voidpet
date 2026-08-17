package p211ld;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p355td.b;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f48703a;

    @Override // p211ld.a
    public void a(WeakReference weakReference) {
        this.f48703a = weakReference;
    }

    @Override // p211ld.a
    public void b(b context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
