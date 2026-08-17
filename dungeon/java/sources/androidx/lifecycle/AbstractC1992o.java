package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import p088ef.C3282e0;
import p088ef.W0;

/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1992o {
    public static final AbstractC1988k a(AbstractC1987j abstractC1987j) {
        C1989l c1989l;
        Intrinsics.checkNotNullParameter(abstractC1987j, "<this>");
        do {
            C1989l c1989l2 = (C1989l) abstractC1987j.c().b();
            if (c1989l2 != null) {
                return c1989l2;
            }
            c1989l = new C1989l(abstractC1987j, W0.b(null, 1, null).P(C3282e0.c().t0()));
        } while (!abstractC1987j.c().a(null, c1989l));
        c1989l.b();
        return c1989l;
    }
}
