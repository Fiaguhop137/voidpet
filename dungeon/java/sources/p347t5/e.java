package p347t5;

import W4.a;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import p151i6.b;
import p329s5.InterfaceC4163c;
import p329s5.g;
import p329s5.i;
import p329s5.j;
import p329s5.k;
import p329s5.l;
import p329s5.n;
import p329s5.o;
import p329s5.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f54515a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), dVar.i());
            b(jVar, dVar);
            return jVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, dVar);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            a.K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        k kVarA = k.a((ColorDrawable) drawable);
        b(kVarA, dVar);
        return kVarA;
    }

    static void b(i iVar, d dVar) {
        iVar.c(dVar.j());
        iVar.t(dVar.d());
        iVar.b(dVar.b(), dVar.c());
        iVar.h(dVar.g());
        iVar.n(dVar.l());
        iVar.m(dVar.h());
        iVar.k(dVar.i());
    }

    static InterfaceC4163c c(InterfaceC4163c interfaceC4163c) {
        while (true) {
            Object objS = interfaceC4163c.s();
            if (objS == interfaceC4163c || !(objS instanceof InterfaceC4163c)) {
                break;
            }
            interfaceC4163c = (InterfaceC4163c) objS;
        }
        return interfaceC4163c;
    }

    static Drawable d(Drawable drawable, d dVar, Resources resources) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.BITMAP_ONLY) {
                if (!(drawable instanceof g)) {
                    return a(drawable, dVar, resources);
                }
                InterfaceC4163c interfaceC4163cC = c((g) drawable);
                interfaceC4163cC.g(a(interfaceC4163cC.g(f54515a), dVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, d dVar) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.OVERLAY_COLOR) {
                l lVar = new l(drawable);
                b(lVar, dVar);
                lVar.y(dVar.f());
                return lVar;
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, q qVar) {
        return g(drawable, qVar, null);
    }

    static Drawable g(Drawable drawable, q qVar, PointF pointF) {
        if (b.d()) {
            b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || qVar == null) {
            if (b.d()) {
                b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, qVar);
        if (pointF != null) {
            oVar.B(pointF);
        }
        if (b.d()) {
            b.b();
        }
        return oVar;
    }

    static void h(i iVar) {
        iVar.c(false);
        iVar.j(0.0f);
        iVar.b(0, 0.0f);
        iVar.h(0.0f);
        iVar.n(false);
        iVar.m(false);
        iVar.k(j.o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(InterfaceC4163c interfaceC4163c, d dVar, Resources resources) {
        InterfaceC4163c interfaceC4163cC = c(interfaceC4163c);
        Drawable drawableS = interfaceC4163cC.s();
        if (dVar == null || dVar.k() != d.a.BITMAP_ONLY) {
            if (drawableS instanceof i) {
                h((i) drawableS);
            }
        } else if (drawableS instanceof i) {
            b((i) drawableS, dVar);
        } else if (drawableS != 0) {
            interfaceC4163cC.g(f54515a);
            interfaceC4163cC.g(a(drawableS, dVar, resources));
        }
    }

    static void j(InterfaceC4163c interfaceC4163c, d dVar) {
        Drawable drawableS = interfaceC4163c.s();
        if (dVar == null || dVar.k() != d.a.OVERLAY_COLOR) {
            if (drawableS instanceof l) {
                Drawable drawable = f54515a;
                interfaceC4163c.g(((l) drawableS).v(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableS instanceof l)) {
            interfaceC4163c.g(e(interfaceC4163c.g(f54515a), dVar));
            return;
        }
        l lVar = (l) drawableS;
        b(lVar, dVar);
        lVar.y(dVar.f());
    }

    static o k(InterfaceC4163c interfaceC4163c, q qVar) {
        Drawable drawableF = f(interfaceC4163c.g(f54515a), qVar);
        interfaceC4163c.g(drawableF);
        V4.k.h(drawableF, "Parent has no child drawable!");
        return (o) drawableF;
    }
}
