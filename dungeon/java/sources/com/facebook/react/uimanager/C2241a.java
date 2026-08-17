package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2241a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2241a f30384a = new C2241a();

    private C2241a() {
    }

    public static final void A(View view, float f10) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Z6.a.c(view) != 2) {
            return;
        }
        f30384a.g(view).i(H.f30189a.b(f10));
    }

    public static final void a(View view, Canvas canvas) {
        RectF rectFA;
        float fB;
        float fB2;
        float fB3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!D6.b.l()) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            p026b7.d dVarK = f30384a.k(view);
            if (dVarK == null) {
                canvas.clipRect(rect);
                return;
            }
            Path pathP = dVarK.p();
            if (pathP != null) {
                pathP.offset(rect.left, rect.top);
                canvas.clipPath(pathP);
                return;
            } else {
                RectF rectFQ = dVarK.q();
                Intrinsics.checkNotNullExpressionValue(rectFQ, "getPaddingBoxRect(...)");
                rectFQ.offset(rect.left, rect.top);
                canvas.clipRect(rectFQ);
                return;
            }
        }
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        C2241a c2241a = f30384a;
        p026b7.e eVarL = c2241a.l(view);
        if (eVarL == null) {
            canvas.clipRect(rect2);
            return;
        }
        RectF rectF = new RectF();
        p080e7.c cVarC = eVarL.c();
        if (cVarC != null) {
            int layoutDirection = eVarL.getLayoutDirection();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rectFA = cVarC.a(layoutDirection, context);
        } else {
            rectFA = null;
        }
        float f10 = eVarL.getBounds().left;
        float fB4 = 0.0f;
        if (rectFA != null) {
            fB = H.f30189a.b(rectFA.left);
        } else {
            fB = 0.0f;
        }
        rectF.left = f10 + fB;
        float f11 = eVarL.getBounds().top;
        if (rectFA != null) {
            fB2 = H.f30189a.b(rectFA.top);
        } else {
            fB2 = 0.0f;
        }
        rectF.top = f11 + fB2;
        float f12 = eVarL.getBounds().right;
        if (rectFA != null) {
            fB3 = H.f30189a.b(rectFA.right);
        } else {
            fB3 = 0.0f;
        }
        rectF.right = f12 - fB3;
        float f13 = eVarL.getBounds().bottom;
        if (rectFA != null) {
            fB4 = H.f30189a.b(rectFA.bottom);
        }
        rectF.bottom = f13 - fB4;
        p080e7.e eVarD = eVarL.d();
        if (eVarD == null || !eVarD.c()) {
            rectF.offset(rect2.left, rect2.top);
            canvas.clipRect(rectF);
        } else {
            Path pathB = c2241a.b(view, eVarL, rectF, rectFA);
            pathB.offset(rect2.left, rect2.top);
            canvas.clipPath(pathB);
        }
    }

    private final Path b(View view, p026b7.e eVar, RectF rectF, RectF rectF2) {
        p080e7.k kVarD;
        p080e7.l lVarA;
        p080e7.l lVarA2;
        p080e7.l lVarB;
        p080e7.l lVarB2;
        p080e7.l lVarD;
        p080e7.l lVarD2;
        p080e7.l lVarC;
        p080e7.l lVarC2;
        p080e7.e eVarD = eVar.d();
        if (eVarD != null) {
            int layoutDirection = eVar.getLayoutDirection();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kVarD = eVarD.d(layoutDirection, context, H.g(eVar.getBounds().width()), H.g(eVar.getBounds().height()));
        } else {
            kVarD = null;
        }
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{m((kVarD == null || (lVarC2 = kVarD.c()) == null) ? null : Float.valueOf(H.f30189a.b(lVarC2.a())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.left)) : null), m((kVarD == null || (lVarC = kVarD.c()) == null) ? null : Float.valueOf(H.f30189a.b(lVarC.b())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.top)) : null), m((kVarD == null || (lVarD2 = kVarD.d()) == null) ? null : Float.valueOf(H.f30189a.b(lVarD2.a())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.right)) : null), m((kVarD == null || (lVarD = kVarD.d()) == null) ? null : Float.valueOf(H.f30189a.b(lVarD.b())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.top)) : null), m((kVarD == null || (lVarB2 = kVarD.b()) == null) ? null : Float.valueOf(H.f30189a.b(lVarB2.a())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.right)) : null), m((kVarD == null || (lVarB = kVarD.b()) == null) ? null : Float.valueOf(H.f30189a.b(lVarB.b())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.bottom)) : null), m((kVarD == null || (lVarA2 = kVarD.a()) == null) ? null : Float.valueOf(H.f30189a.b(lVarA2.a())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.left)) : null), m((kVarD == null || (lVarA = kVarD.a()) == null) ? null : Float.valueOf(H.f30189a.b(lVarA.b())), rectF2 != null ? Float.valueOf(H.f30189a.b(rectF2.bottom)) : null)}, Path.Direction.CW);
        return path;
    }

    private final p026b7.a c(View view) {
        p026b7.e eVarF = f(view);
        p026b7.a aVarA = eVarF.a();
        if (aVarA != null) {
            return aVarA;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p026b7.a aVar = new p026b7.a(context, eVarF.d(), eVarF.c());
        view.setBackground(eVarF.l(aVar));
        return aVar;
    }

    private final p026b7.b d(View view) {
        p026b7.e eVarF = f(view);
        p026b7.b bVarB = eVarF.b();
        if (bVarB != null) {
            return bVarB;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p080e7.e eVarD = eVarF.d();
        p026b7.b bVar = new p026b7.b(context, new C2258i0(0.0f), eVarD, eVarF.c(), p080e7.f.SOLID);
        view.setBackground(eVarF.m(bVar));
        return bVar;
    }

    private final p026b7.d e(View view) {
        p026b7.e eVarF = f(view);
        p026b7.d dVarE = eVarF.e();
        if (dVarE != null) {
            return dVarE;
        }
        p026b7.d dVar = new p026b7.d(view.getContext());
        view.setBackground(eVarF.n(dVar));
        return dVar;
    }

    private final p026b7.e f(View view) {
        if (view.getBackground() instanceof p026b7.e) {
            Drawable background = view.getBackground();
            Intrinsics.d(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (p026b7.e) background;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p026b7.e eVar = new p026b7.e(context, view.getBackground(), null, null, null, null, null, null, null, null, null, 2044, null);
        view.setBackground(eVar);
        return eVar;
    }

    private final p026b7.h g(View view) {
        p026b7.e eVarF = f(view);
        p026b7.h hVarI = eVarF.i();
        if (hVarI != null) {
            return hVarI;
        }
        p080e7.e eVarD = D6.b.l() ? eVarF.d() : e(view).h();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p026b7.h hVar = new p026b7.h(context, eVarD, -16777216, 0.0f, p080e7.p.SOLID, 0.0f);
        view.setBackground(eVarF.p(hVar));
        return hVar;
    }

    private final p026b7.a h(View view) {
        p026b7.e eVarL = l(view);
        if (eVarL != null) {
            return eVarL.a();
        }
        return null;
    }

    public static final Integer i(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (D6.b.l()) {
            p026b7.a aVarH = f30384a.h(view);
            if (aVarH != null) {
                return Integer.valueOf(aVarH.b());
            }
            return null;
        }
        p026b7.d dVarK = f30384a.k(view);
        if (dVarK != null) {
            return Integer.valueOf(dVarK.k());
        }
        return null;
    }

    public static final C2281y j(View view, p080e7.d corner) {
        p080e7.e eVarH;
        p080e7.e eVarD;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        if (D6.b.l()) {
            p026b7.e eVarL = f30384a.l(view);
            if (eVarL == null || (eVarD = eVarL.d()) == null) {
                return null;
            }
            return eVarD.b(corner);
        }
        p026b7.d dVarK = f30384a.k(view);
        if (dVarK == null || (eVarH = dVarK.h()) == null) {
            return null;
        }
        return eVarH.b(corner);
    }

    private final p026b7.d k(View view) {
        p026b7.e eVarL = l(view);
        if (eVarL != null) {
            return eVarL.e();
        }
        return null;
    }

    private final p026b7.e l(View view) {
        Drawable background = view.getBackground();
        if (background instanceof p026b7.e) {
            return (p026b7.e) background;
        }
        return null;
    }

    private final float m(Float f10, Float f11) {
        return kotlin.ranges.e.d((f10 != null ? f10.floatValue() : 0.0f) - (f11 != null ? f11.floatValue() : 0.0f), 0.0f);
    }

    public static final void n(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getBackground() instanceof p026b7.e) {
            Drawable background = view.getBackground();
            Intrinsics.d(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((p026b7.e) background).g());
        }
    }

    public static final void o(View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((num == null || num.intValue() == 0) && !(view.getBackground() instanceof p026b7.e)) {
            return;
        }
        if (D6.b.l()) {
            f30384a.c(view).d(num != null ? num.intValue() : 0);
        } else {
            f30384a.e(view).C(num != null ? num.intValue() : 0);
        }
    }

    public static final void p(View view, List list) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (D6.b.l()) {
            f30384a.c(view).e(list);
        } else {
            f30384a.e(view).v(list);
        }
    }

    public static final void q(View view, p080e7.o edge, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        if (D6.b.l()) {
            f30384a.d(view).o(edge, num);
        } else {
            f30384a.e(view).x(edge.h(), num);
        }
    }

    public static final void r(View view, p080e7.d corner, C2281y c2281y) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        C2241a c2241a = f30384a;
        p026b7.e eVarF = c2241a.f(view);
        p080e7.e eVarD = eVarF.d();
        if (eVarD == null) {
            eVarD = new p080e7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        eVarF.k(eVarD);
        p080e7.e eVarD2 = eVarF.d();
        if (eVarD2 != null) {
            eVarD2.e(corner, c2281y);
        }
        if (D6.b.l()) {
            if (view instanceof ImageView) {
                c2241a.c(view);
            }
            p026b7.a aVarA = eVarF.a();
            if (aVarA != null) {
                aVarA.g(eVarF.d());
            }
            p026b7.b bVarB = eVarF.b();
            if (bVarB != null) {
                bVarB.q(eVarF.d());
            }
            p026b7.a aVarA2 = eVarF.a();
            if (aVarA2 != null) {
                aVarA2.invalidateSelf();
            }
            p026b7.b bVarB2 = eVarF.b();
            if (bVarB2 != null) {
                bVarB2.invalidateSelf();
            }
        } else {
            c2241a.e(view).z(corner, c2281y);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            List listH = eVarF.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof p026b7.i) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p026b7.i) it.next()).c(eVarF.d());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List listF = eVarF.f();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listF) {
                if (obj2 instanceof p026b7.f) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((p026b7.f) it2.next()).e(eVarF.d());
            }
        }
        p026b7.h hVarI = eVarF.i();
        if (hVarI != null) {
            hVarI.e(eVarF.d());
        }
        eVarF.invalidateSelf();
    }

    public static final void s(View view, p080e7.f fVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (D6.b.l()) {
            f30384a.d(view).r(fVar);
        } else {
            f30384a.e(view).A(fVar);
        }
    }

    public static final void t(View view, p080e7.o edge, Float f10) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        C2241a c2241a = f30384a;
        p026b7.e eVarF = c2241a.f(view);
        p080e7.c cVarC = eVarF.c();
        if (cVarC == null) {
            cVarC = new p080e7.c();
        }
        eVarF.j(cVarC);
        p080e7.c cVarC2 = eVarF.c();
        if (cVarC2 != null) {
            cVarC2.b(edge, f10);
        }
        if (D6.b.l()) {
            c2241a.d(view).s(edge.h(), f10 != null ? H.f30189a.b(f10.floatValue()) : Float.NaN);
            p026b7.a aVarA = eVarF.a();
            if (aVarA != null) {
                aVarA.f(eVarF.c());
            }
            p026b7.b bVarB = eVarF.b();
            if (bVarB != null) {
                bVarB.p(eVarF.c());
            }
            p026b7.a aVarA2 = eVarF.a();
            if (aVarA2 != null) {
                aVarA2.invalidateSelf();
            }
            p026b7.b bVarB2 = eVarF.b();
            if (bVarB2 != null) {
                bVarB2.invalidateSelf();
            }
        } else {
            c2241a.e(view).B(edge.h(), f10 != null ? H.f30189a.b(f10.floatValue()) : Float.NaN);
        }
        p080e7.c cVarC3 = eVarF.c();
        if (cVarC3 == null) {
            cVarC3 = new p080e7.c();
        }
        eVarF.j(cVarC3);
        p080e7.c cVarC4 = eVarF.c();
        if (cVarC4 != null) {
            cVarC4.b(edge, f10);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List listF = eVarF.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (obj instanceof p026b7.f) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p026b7.f) it.next()).d(eVarF.c());
            }
        }
    }

    public static final void u(View view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (readableArray == null) {
            v(view, CollectionsKt.l());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            e7.g.a aVar = p080e7.g.f40568g;
            ReadableMap map = readableArray.getMap(i10);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            p080e7.g gVarA = aVar.a(map, context);
            if (gVarA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(gVarA);
        }
        v(view, arrayList);
    }

    public static final void v(View view, List shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(shadows, "shadows");
        if (Z6.a.c(view) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        p026b7.e eVarF = f30384a.f(view);
        p080e7.c cVarC = eVarF.c();
        p080e7.e eVarD = eVarF.d();
        Iterator it = shadows.iterator();
        while (it.hasNext()) {
            p080e7.g gVar = (p080e7.g) it.next();
            float fD = gVar.d();
            float fE = gVar.e();
            Integer numB = gVar.b();
            int iIntValue = numB != null ? numB.intValue() : -16777216;
            Float fA = gVar.a();
            float fFloatValue = fA != null ? fA.floatValue() : 0.0f;
            Float f10 = gVar.f();
            float fFloatValue2 = f10 != null ? f10.floatValue() : 0.0f;
            Boolean boolC = gVar.c();
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            if (zBooleanValue && Build.VERSION.SDK_INT >= 29) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList.add(new p026b7.f(context, iIntValue, fD, fE, fFloatValue, fFloatValue2, cVarC, eVarD));
            } else if (!zBooleanValue && Build.VERSION.SDK_INT >= 28) {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                arrayList2.add(new p026b7.i(context2, iIntValue, fD, fE, fFloatValue, fFloatValue2, eVarD));
            }
        }
        view.setBackground(f30384a.f(view).q(arrayList2, arrayList));
    }

    public static final void w(View view, Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (D6.b.l()) {
            f30384a.f(view).o(drawable);
        } else {
            view.setBackground(f30384a.f(view).o(drawable));
        }
    }

    public static final void x(View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Z6.a.c(view) != 2) {
            return;
        }
        p026b7.h hVarG = f30384a.g(view);
        if (num != null) {
            hVarG.f(num.intValue());
        }
    }

    public static final void y(View view, float f10) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Z6.a.c(view) != 2) {
            return;
        }
        f30384a.g(view).g(H.f30189a.b(f10));
    }

    public static final void z(View view, p080e7.p pVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Z6.a.c(view) != 2) {
            return;
        }
        p026b7.h hVarG = f30384a.g(view);
        if (pVar != null) {
            hVarG.h(pVar);
        }
    }
}
