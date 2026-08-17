package F0;

import android.graphics.Typeface;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f2898a = C.a();

    public H a(E e10, w wVar, Function1 function1, Function1 function2) {
        Typeface typefaceA;
        AbstractC0974h abstractC0974hC = e10.c();
        if (abstractC0974hC == null || (abstractC0974hC instanceof C0972f)) {
            typefaceA = this.f2898a.a(e10.e(), e10.d());
        } else {
            if (!(abstractC0974hC instanceof u)) {
                return null;
            }
            typefaceA = this.f2898a.b((u) e10.c(), e10.e(), e10.d());
        }
        return new H.a(typefaceA, false, 2, null);
    }
}
