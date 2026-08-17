package p037c0;

import O0.p;
import android.graphics.Rect;
import android.graphics.RectF;
import p019b0.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static final Rect a(p pVar) {
        return new Rect(pVar.f(), pVar.h(), pVar.g(), pVar.d());
    }

    public static final Rect b(g gVar) {
        return new Rect((int) gVar.e(), (int) gVar.h(), (int) gVar.f(), (int) gVar.c());
    }

    public static final RectF c(g gVar) {
        return new RectF(gVar.e(), gVar.h(), gVar.f(), gVar.c());
    }

    public static final p d(Rect rect) {
        return new p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final g e(Rect rect) {
        return new g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
