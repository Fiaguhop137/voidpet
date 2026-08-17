package p443yb;

import A1.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final boolean a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.l()) {
            a[] aVarArrP = aVar.p();
            Intrinsics.checkNotNullExpressionValue(aVarArrP, "listFiles(...)");
            for (a aVar2 : aVarArrP) {
                Intrinsics.c(aVar2);
                a(aVar2);
            }
        }
        return aVar.e();
    }
}
