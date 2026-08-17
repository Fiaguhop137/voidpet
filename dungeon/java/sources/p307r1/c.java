package p307r1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f52023a = new ArrayList();

    public final void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52023a.add(listener);
    }

    public final void b(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52023a.remove(listener);
    }
}
