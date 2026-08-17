package D4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p274p4.h;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p328s4.d f2140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f2141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f2142c;

    public c(p328s4.d dVar, e eVar, e eVar2) {
        this.f2140a = dVar;
        this.f2141b = eVar;
        this.f2142c = eVar2;
    }

    private static v b(v vVar) {
        return vVar;
    }

    @Override // D4.e
    public v a(v vVar, h hVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f2141b.a(p436y4.f.d(((BitmapDrawable) drawable).getBitmap(), this.f2140a), hVar);
        }
        if (drawable instanceof C4.c) {
            return this.f2142c.a(b(vVar), hVar);
        }
        return null;
    }
}
