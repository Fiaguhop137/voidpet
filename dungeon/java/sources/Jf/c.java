package Jf;

import If.AbstractC1113o;
import If.C1112n;
import If.Q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.C3951m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(AbstractC1113o abstractC1113o, Q dir, boolean z10) {
        Intrinsics.checkNotNullParameter(abstractC1113o, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        C3951m c3951m = new C3951m();
        for (Q qR = dir; qR != null && !abstractC1113o.j(qR); qR = qR.r()) {
            c3951m.addFirst(qR);
        }
        if (z10 && c3951m.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c3951m.iterator();
        while (it.hasNext()) {
            abstractC1113o.f((Q) it.next());
        }
    }

    public static final boolean b(AbstractC1113o abstractC1113o, Q path) {
        Intrinsics.checkNotNullParameter(abstractC1113o, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return abstractC1113o.m(path) != null;
    }

    public static final C1112n c(AbstractC1113o abstractC1113o, Q path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(abstractC1113o, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        C1112n c1112nM = abstractC1113o.m(path);
        if (c1112nM != null) {
            return c1112nM;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
