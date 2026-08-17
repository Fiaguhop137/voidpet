package D3;

import K3.o;
import Q3.F;
import kotlin.jvm.internal.Intrinsics;
import p435y3.C;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    @Override // D3.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(C c10, o oVar) {
        if (!Intrinsics.b(c10.c(), "android.resource")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c10);
        sb2.append(':');
        sb2.append(F.d(oVar.c().getResources().getConfiguration()));
        return sb2.toString();
    }
}
