package p297q9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p297q9.c f51671m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f51672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f51673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f51674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d f51675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p297q9.c f51676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    p297q9.c f51677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    p297q9.c f51678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    p297q9.c f51679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f f51680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    f f51681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    f f51682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    f f51683l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f51684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f51685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f51686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f51687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p297q9.c f51688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p297q9.c f51689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p297q9.c f51690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p297q9.c f51691h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f f51692i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f51693j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f f51694k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private f f51695l;

        public b() {
            this.f51684a = h.b();
            this.f51685b = h.b();
            this.f51686c = h.b();
            this.f51687d = h.b();
            this.f51688e = new p297q9.a(0.0f);
            this.f51689f = new p297q9.a(0.0f);
            this.f51690g = new p297q9.a(0.0f);
            this.f51691h = new p297q9.a(0.0f);
            this.f51692i = h.c();
            this.f51693j = h.c();
            this.f51694k = h.c();
            this.f51695l = h.c();
        }

        public b(k kVar) {
            this.f51684a = h.b();
            this.f51685b = h.b();
            this.f51686c = h.b();
            this.f51687d = h.b();
            this.f51688e = new p297q9.a(0.0f);
            this.f51689f = new p297q9.a(0.0f);
            this.f51690g = new p297q9.a(0.0f);
            this.f51691h = new p297q9.a(0.0f);
            this.f51692i = h.c();
            this.f51693j = h.c();
            this.f51694k = h.c();
            this.f51695l = h.c();
            this.f51684a = kVar.f51672a;
            this.f51685b = kVar.f51673b;
            this.f51686c = kVar.f51674c;
            this.f51687d = kVar.f51675d;
            this.f51688e = kVar.f51676e;
            this.f51689f = kVar.f51677f;
            this.f51690g = kVar.f51678g;
            this.f51691h = kVar.f51679h;
            this.f51692i = kVar.f51680i;
            this.f51693j = kVar.f51681j;
            this.f51694k = kVar.f51682k;
            this.f51695l = kVar.f51683l;
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f51670a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f51618a;
            }
            return -1.0f;
        }

        public b A(d dVar) {
            this.f51684a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                B(fN);
            }
            return this;
        }

        public b B(float f10) {
            this.f51688e = new p297q9.a(f10);
            return this;
        }

        public b C(p297q9.c cVar) {
            this.f51688e = cVar;
            return this;
        }

        public b D(int i10, float f10) {
            return F(h.a(i10)).G(f10);
        }

        public b E(int i10, p297q9.c cVar) {
            return F(h.a(i10)).H(cVar);
        }

        public b F(d dVar) {
            this.f51685b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                G(fN);
            }
            return this;
        }

        public b G(float f10) {
            this.f51689f = new p297q9.a(f10);
            return this;
        }

        public b H(p297q9.c cVar) {
            this.f51689f = cVar;
            return this;
        }

        public k m() {
            return new k(this, null);
        }

        public b o(float f10) {
            return B(f10).G(f10).w(f10).s(f10);
        }

        public b p(p297q9.c cVar) {
            return C(cVar).H(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, p297q9.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f51687d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f10) {
            this.f51691h = new p297q9.a(f10);
            return this;
        }

        public b t(p297q9.c cVar) {
            this.f51691h = cVar;
            return this;
        }

        public b u(int i10, p297q9.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f51686c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f10) {
            this.f51690g = new p297q9.a(f10);
            return this;
        }

        public b x(p297q9.c cVar) {
            this.f51690g = cVar;
            return this;
        }

        public b y(int i10, float f10) {
            return A(h.a(i10)).B(f10);
        }

        public b z(int i10, p297q9.c cVar) {
            return A(h.a(i10)).C(cVar);
        }
    }

    public interface c {
        p297q9.c a(p297q9.c cVar);
    }

    public k() {
        this.f51672a = h.b();
        this.f51673b = h.b();
        this.f51674c = h.b();
        this.f51675d = h.b();
        this.f51676e = new p297q9.a(0.0f);
        this.f51677f = new p297q9.a(0.0f);
        this.f51678g = new p297q9.a(0.0f);
        this.f51679h = new p297q9.a(0.0f);
        this.f51680i = h.c();
        this.f51681j = h.c();
        this.f51682k = h.c();
        this.f51683l = h.c();
    }

    private k(b bVar) {
        this.f51672a = bVar.f51684a;
        this.f51673b = bVar.f51685b;
        this.f51674c = bVar.f51686c;
        this.f51675d = bVar.f51687d;
        this.f51676e = bVar.f51688e;
        this.f51677f = bVar.f51689f;
        this.f51678g = bVar.f51690g;
        this.f51679h = bVar.f51691h;
        this.f51680i = bVar.f51692i;
        this.f51681j = bVar.f51693j;
        this.f51682k = bVar.f51694k;
        this.f51683l = bVar.f51695l;
    }

    /* synthetic */ k(b bVar, a aVar) {
        this(bVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new p297q9.a(i12));
    }

    private static b d(Context context, int i10, int i11, p297q9.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(Y8.k.f17636t5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(Y8.k.f17645u5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(Y8.k.f17672x5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(Y8.k.f17681y5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(Y8.k.f17663w5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(Y8.k.f17654v5, i12);
            p297q9.c cVarM = m(typedArrayObtainStyledAttributes, Y8.k.f17690z5, cVar);
            p297q9.c cVarM2 = m(typedArrayObtainStyledAttributes, Y8.k.f17244C5, cVarM);
            p297q9.c cVarM3 = m(typedArrayObtainStyledAttributes, Y8.k.f17253D5, cVarM);
            p297q9.c cVarM4 = m(typedArrayObtainStyledAttributes, Y8.k.f17235B5, cVarM);
            return new b().z(i13, cVarM2).E(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, Y8.k.f17226A5, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new p297q9.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, p297q9.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y8.k.f17479c4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17489d4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17499e4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static p297q9.c m(TypedArray typedArray, int i10, p297q9.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new p297q9.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public f h() {
        return this.f51682k;
    }

    public d i() {
        return this.f51675d;
    }

    public p297q9.c j() {
        return this.f51679h;
    }

    public d k() {
        return this.f51674c;
    }

    public p297q9.c l() {
        return this.f51678g;
    }

    public f n() {
        return this.f51683l;
    }

    public f o() {
        return this.f51681j;
    }

    public f p() {
        return this.f51680i;
    }

    public d q() {
        return this.f51672a;
    }

    public p297q9.c r() {
        return this.f51676e;
    }

    public d s() {
        return this.f51673b;
    }

    public p297q9.c t() {
        return this.f51677f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f51683l.getClass().equals(f.class) && this.f51681j.getClass().equals(f.class) && this.f51680i.getClass().equals(f.class) && this.f51682k.getClass().equals(f.class);
        float fA = this.f51676e.a(rectF);
        return z10 && ((this.f51677f.a(rectF) > fA ? 1 : (this.f51677f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f51679h.a(rectF) > fA ? 1 : (this.f51679h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f51678g.a(rectF) > fA ? 1 : (this.f51678g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f51673b instanceof j) && (this.f51672a instanceof j) && (this.f51674c instanceof j) && (this.f51675d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(p297q9.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().C(cVar.a(r())).H(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}
