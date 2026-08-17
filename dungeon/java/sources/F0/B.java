package F0;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class B implements y {
    private final Typeface c(String str, r rVar, int i10) {
        if (p.f(i10, p.f2863b.b()) && Intrinsics.b(rVar, r.f2873b.c()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = AbstractC0970d.c(rVar, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(str, iC);
    }

    private final Typeface d(String str, r rVar, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceC = c(str, rVar, i10);
        if (Intrinsics.b(typefaceC, Typeface.create(Typeface.DEFAULT, AbstractC0970d.c(rVar, i10))) || Intrinsics.b(typefaceC, c(null, rVar, i10))) {
            return null;
        }
        return typefaceC;
    }

    @Override // F0.y
    public Typeface a(r rVar, int i10) {
        return c(null, rVar, i10);
    }

    @Override // F0.y
    public Typeface b(u uVar, r rVar, int i10) {
        Typeface typefaceD = d(C.b(uVar.b(), rVar), rVar, i10);
        return typefaceD == null ? c(uVar.b(), rVar, i10) : typefaceD;
    }
}
