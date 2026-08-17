package Ne;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L {
    public static final p464ze.b a(p410we.d dVar, int i10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return p464ze.b.f58558d.a(dVar.b(i10), dVar.a(i10));
    }

    public static final p464ze.f b(p410we.d dVar, int i10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        p464ze.f fVarO = p464ze.f.o(dVar.getString(i10));
        Intrinsics.checkNotNullExpressionValue(fVarO, "guessByFirstCharacter(...)");
        return fVarO;
    }
}
