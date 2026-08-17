package p410we;

import Be.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final Object a(i.d dVar, i.f extension) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (dVar.r(extension)) {
            return dVar.o(extension);
        }
        return null;
    }

    public static final Object b(i.d dVar, i.f extension, int i10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (i10 < dVar.q(extension)) {
            return dVar.p(extension, i10);
        }
        return null;
    }
}
