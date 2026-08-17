package F0;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class A implements y {
    private final Typeface c(String str, r rVar, int i10) {
        p.a aVar = p.f2863b;
        if (p.f(i10, aVar.b()) && Intrinsics.b(rVar, r.f2873b.c()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), rVar.p(), p.f(i10, aVar.a()));
    }

    @Override // F0.y
    public Typeface a(r rVar, int i10) {
        return c(null, rVar, i10);
    }

    @Override // F0.y
    public Typeface b(u uVar, r rVar, int i10) {
        return c(uVar.b(), rVar, i10);
    }
}
