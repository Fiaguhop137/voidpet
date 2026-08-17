package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1996t {
    public static final void a(InterfaceC1994q interfaceC1994q, AbstractC1987j.b current, AbstractC1987j.b next) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == AbstractC1987j.b.INITIALIZED && next == AbstractC1987j.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + AbstractC1987j.b.CREATED + "' to be moved to '" + next + "' in component " + interfaceC1994q).toString());
        }
        AbstractC1987j.b bVar = AbstractC1987j.b.DESTROYED;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + interfaceC1994q).toString());
    }
}
