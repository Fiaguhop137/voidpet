package Yb;

import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f17765a;

    public g(String[] names) {
        Intrinsics.checkNotNullParameter(names, "names");
        this.f17765a = names;
    }

    public final String[] a() {
        return this.f17765a;
    }

    public final g b(g gVar) {
        return gVar == null ? this : new g((String[]) AbstractC3952n.C(this.f17765a, gVar.f17765a));
    }
}
