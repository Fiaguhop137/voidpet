package p203l5;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p025b6.e;
import p025b6.f;
import p151i6.b;
import p329s5.h;

/* JADX INFO: loaded from: classes2.dex */
public class a implements p007a6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f48636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p007a6.a f48637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p007a6.a f48638c;

    public a(Resources resources, p007a6.a aVar, p007a6.a aVar2) {
        this.f48636a = resources;
        this.f48637b = aVar;
        this.f48638c = aVar2;
    }

    private static boolean c(f fVar) {
        return (fVar.f2() == 1 || fVar.f2() == 0) ? false : true;
    }

    private static boolean d(f fVar) {
        return (fVar.A2() == 0 || fVar.A2() == -1) ? false : true;
    }

    @Override // p007a6.a
    public boolean a(e eVar) {
        return true;
    }

    @Override // p007a6.a
    public Drawable b(e eVar) {
        try {
            if (b.d()) {
                b.a("DefaultDrawableFactory#createDrawable");
            }
            if (eVar instanceof f) {
                f fVar = (f) eVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f48636a, fVar.n3());
                if (!d(fVar) && !c(fVar)) {
                    if (b.d()) {
                        b.b();
                    }
                    return bitmapDrawable;
                }
                h hVar = new h(bitmapDrawable, fVar.A2(), fVar.f2());
                if (b.d()) {
                    b.b();
                }
                return hVar;
            }
            p007a6.a aVar = this.f48637b;
            if (aVar != null && aVar.a(eVar)) {
                Drawable drawableB = this.f48637b.b(eVar);
                if (b.d()) {
                    b.b();
                }
                return drawableB;
            }
            p007a6.a aVar2 = this.f48638c;
            if (aVar2 == null || !aVar2.a(eVar)) {
                if (b.d()) {
                    b.b();
                }
                return null;
            }
            Drawable drawableB2 = this.f48638c.b(eVar);
            if (b.d()) {
                b.b();
            }
            return drawableB2;
        } catch (Throwable th) {
            if (b.d()) {
                b.b();
            }
            throw th;
        }
    }
}
