package p176je;

import kotlin.jvm.internal.Intrinsics;
import p464ze.c;
import p464ze.d;
import p464ze.f;

/* JADX INFO: renamed from: je.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3880k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final c c(c cVar, String str) {
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return cVar.b(fVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c d(d dVar, String str) {
        f fVarP = f.p(str);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return dVar.b(fVarP).m();
    }
}
