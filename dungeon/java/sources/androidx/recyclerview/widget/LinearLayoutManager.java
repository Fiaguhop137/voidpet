package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f24895A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f24896B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f24897C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    d f24898D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final a f24899E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final b f24900F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f24901G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int[] f24902H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f24903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f24904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f24905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f24906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f24907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f24908x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f24909y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f24910z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f24911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f24914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f24915e;

        a() {
            e();
        }

        void a() {
            this.f24913c = this.f24914d ? this.f24911a.i() : this.f24911a.m();
        }

        public void b(View view, int i10) {
            if (this.f24914d) {
                this.f24913c = this.f24911a.d(view) + this.f24911a.o();
            } else {
                this.f24913c = this.f24911a.g(view);
            }
            this.f24912b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f24911a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f24912b = i10;
            if (this.f24914d) {
                int i11 = (this.f24911a.i() - iO) - this.f24911a.d(view);
                this.f24913c = this.f24911a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f24913c - this.f24911a.e(view);
                    int iM = this.f24911a.m();
                    int iMin = iE - (iM + Math.min(this.f24911a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f24913c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f24911a.g(view);
            int iM2 = iG - this.f24911a.m();
            this.f24913c = iG;
            if (iM2 > 0) {
                int i12 = (this.f24911a.i() - Math.min(0, (this.f24911a.i() - iO) - this.f24911a.d(view))) - (iG + this.f24911a.e(view));
                if (i12 < 0) {
                    this.f24913c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        void e() {
            this.f24912b = -1;
            this.f24913c = Integer.MIN_VALUE;
            this.f24914d = false;
            this.f24915e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f24912b + ", mCoordinate=" + this.f24913c + ", mLayoutFromEnd=" + this.f24914d + ", mValid=" + this.f24915e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24919d;

        protected b() {
        }

        void a() {
            this.f24916a = 0;
            this.f24917b = false;
            this.f24918c = false;
            this.f24919d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f24923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f24925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f24926g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f24930k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f24932m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f24920a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f24927h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f24928i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f24929j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f24931l = null;

        c() {
        }

        private View e() {
            int size = this.f24931l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.C) this.f24931l.get(i10)).f25024a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f24923d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f24923d = -1;
            } else {
                this.f24923d = ((RecyclerView.p) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.z zVar) {
            int i10 = this.f24923d;
            return i10 >= 0 && i10 < zVar.b();
        }

        View d(RecyclerView.u uVar) {
            if (this.f24931l != null) {
                return e();
            }
            View viewO = uVar.o(this.f24923d);
            this.f24923d += this.f24924e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f24931l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.C) this.f24931l.get(i11)).f25024a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (iA = (pVar.a() - this.f24923d) * this.f24924e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f24935c;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f24933a = parcel.readInt();
            this.f24934b = parcel.readInt();
            this.f24935c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f24933a = dVar.f24933a;
            this.f24934b = dVar.f24934b;
            this.f24935c = dVar.f24935c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        boolean f() {
            return this.f24933a >= 0;
        }

        void j() {
            this.f24933a = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f24933a);
            parcel.writeInt(this.f24934b);
            parcel.writeInt(this.f24935c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f24903s = 1;
        this.f24907w = false;
        this.f24908x = false;
        this.f24909y = false;
        this.f24910z = true;
        this.f24895A = -1;
        this.f24896B = Integer.MIN_VALUE;
        this.f24898D = null;
        this.f24899E = new a();
        this.f24900F = new b();
        this.f24901G = 2;
        this.f24902H = new int[2];
        G2(i10);
        H2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f24903s = 1;
        this.f24907w = false;
        this.f24908x = false;
        this.f24909y = false;
        this.f24910z = true;
        this.f24895A = -1;
        this.f24896B = Integer.MIN_VALUE;
        this.f24898D = null;
        this.f24899E = new a();
        this.f24900F = new b();
        this.f24901G = 2;
        this.f24902H = new int[2];
        RecyclerView.o.d dVarM0 = RecyclerView.o.m0(context, attributeSet, i10, i11);
        G2(dVarM0.f25080a);
        H2(dVarM0.f25082c);
        I2(dVarM0.f25083d);
    }

    private void A2(RecyclerView.u uVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                r1(i10, uVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                r1(i12, uVar);
            }
        }
    }

    private void B2(RecyclerView.u uVar, int i10, int i11) {
        int iO = O();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f24905u.h() - i10) + i11;
        if (this.f24908x) {
            for (int i12 = 0; i12 < iO; i12++) {
                View viewN = N(i12);
                if (this.f24905u.g(viewN) < iH || this.f24905u.q(viewN) < iH) {
                    A2(uVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewN2 = N(i14);
            if (this.f24905u.g(viewN2) < iH || this.f24905u.q(viewN2) < iH) {
                A2(uVar, i13, i14);
                return;
            }
        }
    }

    private void C2(RecyclerView.u uVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iO = O();
        if (!this.f24908x) {
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                if (this.f24905u.d(viewN) > i12 || this.f24905u.p(viewN) > i12) {
                    A2(uVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iO - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewN2 = N(i15);
            if (this.f24905u.d(viewN2) > i12 || this.f24905u.p(viewN2) > i12) {
                A2(uVar, i14, i15);
                return;
            }
        }
    }

    private void E2() {
        if (this.f24903s == 1 || !u2()) {
            this.f24908x = this.f24907w;
        } else {
            this.f24908x = !this.f24907w;
        }
    }

    private boolean J2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, zVar)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        if (this.f24906v != this.f24909y) {
            return false;
        }
        View viewM2 = aVar.f24914d ? m2(uVar, zVar) : n2(uVar, zVar);
        if (viewM2 == null) {
            return false;
        }
        aVar.b(viewM2, l0(viewM2));
        if (!zVar.e() && P1() && (this.f24905u.g(viewM2) >= this.f24905u.i() || this.f24905u.d(viewM2) < this.f24905u.m())) {
            aVar.f24913c = aVar.f24914d ? this.f24905u.i() : this.f24905u.m();
        }
        return true;
    }

    private boolean K2(RecyclerView.z zVar, a aVar) {
        int i10;
        if (!zVar.e() && (i10 = this.f24895A) != -1) {
            if (i10 >= 0 && i10 < zVar.b()) {
                aVar.f24912b = this.f24895A;
                d dVar = this.f24898D;
                if (dVar != null && dVar.f()) {
                    boolean z10 = this.f24898D.f24935c;
                    aVar.f24914d = z10;
                    if (z10) {
                        aVar.f24913c = this.f24905u.i() - this.f24898D.f24934b;
                    } else {
                        aVar.f24913c = this.f24905u.m() + this.f24898D.f24934b;
                    }
                    return true;
                }
                if (this.f24896B != Integer.MIN_VALUE) {
                    boolean z11 = this.f24908x;
                    aVar.f24914d = z11;
                    if (z11) {
                        aVar.f24913c = this.f24905u.i() - this.f24896B;
                    } else {
                        aVar.f24913c = this.f24905u.m() + this.f24896B;
                    }
                    return true;
                }
                View viewH = H(this.f24895A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f24914d = (this.f24895A < l0(N(0))) == this.f24908x;
                    }
                    aVar.a();
                } else {
                    if (this.f24905u.e(viewH) > this.f24905u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f24905u.g(viewH) - this.f24905u.m() < 0) {
                        aVar.f24913c = this.f24905u.m();
                        aVar.f24914d = false;
                        return true;
                    }
                    if (this.f24905u.i() - this.f24905u.d(viewH) < 0) {
                        aVar.f24913c = this.f24905u.i();
                        aVar.f24914d = true;
                        return true;
                    }
                    aVar.f24913c = aVar.f24914d ? this.f24905u.d(viewH) + this.f24905u.o() : this.f24905u.g(viewH);
                }
                return true;
            }
            this.f24895A = -1;
            this.f24896B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void L2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (K2(zVar, aVar) || J2(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f24912b = this.f24909y ? zVar.b() - 1 : 0;
    }

    private void M2(int i10, int i11, boolean z10, RecyclerView.z zVar) {
        int iM;
        this.f24904t.f24932m = D2();
        this.f24904t.f24925f = i10;
        int[] iArr = this.f24902H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(zVar, iArr);
        int iMax = Math.max(0, this.f24902H[0]);
        int iMax2 = Math.max(0, this.f24902H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f24904t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f24927h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f24928i = iMax;
        if (z11) {
            cVar.f24927h = i12 + this.f24905u.j();
            View viewQ2 = q2();
            c cVar2 = this.f24904t;
            cVar2.f24924e = this.f24908x ? -1 : 1;
            int iL0 = l0(viewQ2);
            c cVar3 = this.f24904t;
            cVar2.f24923d = iL0 + cVar3.f24924e;
            cVar3.f24921b = this.f24905u.d(viewQ2);
            iM = this.f24905u.d(viewQ2) - this.f24905u.i();
        } else {
            View viewR2 = r2();
            this.f24904t.f24927h += this.f24905u.m();
            c cVar4 = this.f24904t;
            cVar4.f24924e = this.f24908x ? 1 : -1;
            int iL1 = l0(viewR2);
            c cVar5 = this.f24904t;
            cVar4.f24923d = iL1 + cVar5.f24924e;
            cVar5.f24921b = this.f24905u.g(viewR2);
            iM = (-this.f24905u.g(viewR2)) + this.f24905u.m();
        }
        c cVar6 = this.f24904t;
        cVar6.f24922c = i11;
        if (z10) {
            cVar6.f24922c = i11 - iM;
        }
        cVar6.f24926g = iM;
    }

    private void N2(int i10, int i11) {
        this.f24904t.f24922c = this.f24905u.i() - i11;
        c cVar = this.f24904t;
        cVar.f24924e = this.f24908x ? -1 : 1;
        cVar.f24923d = i10;
        cVar.f24925f = 1;
        cVar.f24921b = i11;
        cVar.f24926g = Integer.MIN_VALUE;
    }

    private void O2(a aVar) {
        N2(aVar.f24912b, aVar.f24913c);
    }

    private void P2(int i10, int i11) {
        this.f24904t.f24922c = i11 - this.f24905u.m();
        c cVar = this.f24904t;
        cVar.f24923d = i10;
        cVar.f24924e = this.f24908x ? 1 : -1;
        cVar.f24925f = -1;
        cVar.f24921b = i11;
        cVar.f24926g = Integer.MIN_VALUE;
    }

    private void Q2(a aVar) {
        P2(aVar.f24912b, aVar.f24913c);
    }

    private int S1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return m.a(zVar, this.f24905u, c2(!this.f24910z, true), b2(!this.f24910z, true), this, this.f24910z);
    }

    private int T1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return m.b(zVar, this.f24905u, c2(!this.f24910z, true), b2(!this.f24910z, true), this, this.f24910z, this.f24908x);
    }

    private int U1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return m.c(zVar, this.f24905u, c2(!this.f24910z, true), b2(!this.f24910z, true), this, this.f24910z);
    }

    private View Z1() {
        return h2(0, O());
    }

    private View a2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return l2(uVar, zVar, 0, O(), zVar.b());
    }

    private View e2() {
        return h2(O() - 1, -1);
    }

    private View f2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return l2(uVar, zVar, O() - 1, -1, zVar.b());
    }

    private View j2() {
        return this.f24908x ? Z1() : e2();
    }

    private View k2() {
        return this.f24908x ? e2() : Z1();
    }

    private View m2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f24908x ? a2(uVar, zVar) : f2(uVar, zVar);
    }

    private View n2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f24908x ? f2(uVar, zVar) : a2(uVar, zVar);
    }

    private int o2(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int i11;
        int i12 = this.f24905u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -F2(-i12, uVar, zVar);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f24905u.i() - i14) <= 0) {
            return i13;
        }
        this.f24905u.r(i11);
        return i11 + i13;
    }

    private int p2(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int iM;
        int iM2 = i10 - this.f24905u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -F2(iM2, uVar, zVar);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f24905u.m()) <= 0) {
            return i11;
        }
        this.f24905u.r(-iM);
        return i11 - iM;
    }

    private View q2() {
        return N(this.f24908x ? 0 : O() - 1);
    }

    private View r2() {
        return N(this.f24908x ? O() - 1 : 0);
    }

    private void x2(RecyclerView.u uVar, RecyclerView.z zVar, int i10, int i11) {
        if (!zVar.g() || O() == 0 || zVar.e() || !P1()) {
            return;
        }
        List listK = uVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.C c10 = (RecyclerView.C) listK.get(i12);
            if (!c10.v()) {
                if ((c10.m() < iL0) != this.f24908x) {
                    iE += this.f24905u.e(c10.f25024a);
                } else {
                    iE2 += this.f24905u.e(c10.f25024a);
                }
            }
        }
        this.f24904t.f24931l = listK;
        if (iE > 0) {
            P2(l0(r2()), i10);
            c cVar = this.f24904t;
            cVar.f24927h = iE;
            cVar.f24922c = 0;
            cVar.a();
            Y1(uVar, this.f24904t, zVar, false);
        }
        if (iE2 > 0) {
            N2(l0(q2()), i11);
            c cVar2 = this.f24904t;
            cVar2.f24927h = iE2;
            cVar2.f24922c = 0;
            cVar2.a();
            Y1(uVar, this.f24904t, zVar, false);
        }
        this.f24904t.f24931l = null;
    }

    private void z2(RecyclerView.u uVar, c cVar) {
        if (!cVar.f24920a || cVar.f24932m) {
            return;
        }
        int i10 = cVar.f24926g;
        int i11 = cVar.f24928i;
        if (cVar.f24925f == -1) {
            B2(uVar, i10, i11);
        } else {
            C2(uVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f24903s == 1) {
            return 0;
        }
        return F2(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i10) {
        this.f24895A = i10;
        this.f24896B = Integer.MIN_VALUE;
        d dVar = this.f24898D;
        if (dVar != null) {
            dVar.j();
        }
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f24903s == 0) {
            return 0;
        }
        return F2(i10, uVar, zVar);
    }

    boolean D2() {
        return this.f24905u.k() == 0 && this.f24905u.h() == 0;
    }

    int F2(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        X1();
        this.f24904t.f24920a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        M2(i11, iAbs, true, zVar);
        c cVar = this.f24904t;
        int iY1 = cVar.f24926g + Y1(uVar, cVar, zVar, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i10 = i11 * iY1;
        }
        this.f24905u.r(-i10);
        this.f24904t.f24930k = i10;
        return i10;
    }

    public void G2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        if (i10 != this.f24903s || this.f24905u == null) {
            i iVarB = i.b(this, i10);
            this.f24905u = iVarB;
            this.f24899E.f24911a = iVarB;
            this.f24903s = i10;
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H(int i10) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i10 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i10) {
                return viewN;
            }
        }
        return super.H(i10);
    }

    public void H2(boolean z10) {
        l(null);
        if (z10 == this.f24907w) {
            return;
        }
        this.f24907w = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    public void I2(boolean z10) {
        l(null);
        if (this.f24909y == z10) {
            return;
        }
        this.f24909y = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        if (this.f24897C) {
            o1(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        N1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iV1;
        E2();
        if (O() == 0 || (iV1 = V1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        M2(iV1, (int) (this.f24905u.n() * 0.33333334f), false, zVar);
        c cVar = this.f24904t;
        cVar.f24926g = Integer.MIN_VALUE;
        cVar.f24920a = false;
        Y1(uVar, cVar, zVar, true);
        View viewK2 = iV1 == -1 ? k2() : j2();
        View viewR2 = iV1 == -1 ? r2() : q2();
        if (!viewR2.hasFocusable()) {
            return viewK2;
        }
        if (viewK2 == null) {
            return null;
        }
        return viewR2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean P1() {
        return this.f24898D == null && this.f24906v == this.f24909y;
    }

    protected void Q1(RecyclerView.z zVar, int[] iArr) {
        int i10;
        int iS2 = s2(zVar);
        if (this.f24904t.f24925f == -1) {
            i10 = 0;
        } else {
            i10 = iS2;
            iS2 = 0;
        }
        iArr[0] = iS2;
        iArr[1] = i10;
    }

    void R1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f24923d;
        if (i10 < 0 || i10 >= zVar.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f24926g));
    }

    int V1(int i10) {
        if (i10 == 1) {
            return (this.f24903s != 1 && u2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f24903s != 1 && u2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f24903s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f24903s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f24903s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f24903s == 0 ? 1 : Integer.MIN_VALUE;
    }

    c W1() {
        return new c();
    }

    void X1() {
        if (this.f24904t == null) {
            this.f24904t = W1();
        }
    }

    int Y1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z10) {
        int i10 = cVar.f24922c;
        int i11 = cVar.f24926g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f24926g = i11 + i10;
            }
            z2(uVar, cVar);
        }
        int i12 = cVar.f24922c + cVar.f24927h;
        b bVar = this.f24900F;
        while (true) {
            if ((!cVar.f24932m && i12 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            w2(uVar, zVar, cVar, bVar);
            if (!bVar.f24917b) {
                cVar.f24921b += bVar.f24916a * cVar.f24925f;
                if (!bVar.f24918c || cVar.f24931l != null || !zVar.e()) {
                    int i13 = cVar.f24922c;
                    int i14 = bVar.f24916a;
                    cVar.f24922c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f24926g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f24916a;
                    cVar.f24926g = i16;
                    int i17 = cVar.f24922c;
                    if (i17 < 0) {
                        cVar.f24926g = i16 + i17;
                    }
                    z2(uVar, cVar);
                }
                if (z10 && bVar.f24919d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f24922c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iO2;
        int i14;
        View viewH;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.f24898D == null && this.f24895A == -1) && zVar.b() == 0) {
            o1(uVar);
            return;
        }
        d dVar = this.f24898D;
        if (dVar != null && dVar.f()) {
            this.f24895A = this.f24898D.f24933a;
        }
        X1();
        this.f24904t.f24920a = false;
        E2();
        View viewA0 = a0();
        a aVar = this.f24899E;
        if (!aVar.f24915e || this.f24895A != -1 || this.f24898D != null) {
            aVar.e();
            a aVar2 = this.f24899E;
            aVar2.f24914d = this.f24908x ^ this.f24909y;
            L2(uVar, zVar, aVar2);
            this.f24899E.f24915e = true;
        } else if (viewA0 != null && (this.f24905u.g(viewA0) >= this.f24905u.i() || this.f24905u.d(viewA0) <= this.f24905u.m())) {
            this.f24899E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f24904t;
        cVar.f24925f = cVar.f24930k >= 0 ? 1 : -1;
        int[] iArr = this.f24902H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(zVar, iArr);
        int iMax = Math.max(0, this.f24902H[0]) + this.f24905u.m();
        int iMax2 = Math.max(0, this.f24902H[1]) + this.f24905u.j();
        if (zVar.e() && (i14 = this.f24895A) != -1 && this.f24896B != Integer.MIN_VALUE && (viewH = H(i14)) != null) {
            if (this.f24908x) {
                i15 = this.f24905u.i() - this.f24905u.d(viewH);
                iG = this.f24896B;
            } else {
                iG = this.f24905u.g(viewH) - this.f24905u.m();
                i15 = this.f24896B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.f24899E;
        if (!aVar3.f24914d ? !this.f24908x : this.f24908x) {
            i16 = 1;
        }
        y2(uVar, zVar, aVar3, i16);
        B(uVar);
        this.f24904t.f24932m = D2();
        this.f24904t.f24929j = zVar.e();
        this.f24904t.f24928i = 0;
        a aVar4 = this.f24899E;
        if (aVar4.f24914d) {
            Q2(aVar4);
            c cVar2 = this.f24904t;
            cVar2.f24927h = iMax;
            Y1(uVar, cVar2, zVar, false);
            c cVar3 = this.f24904t;
            i11 = cVar3.f24921b;
            int i18 = cVar3.f24923d;
            int i19 = cVar3.f24922c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            O2(this.f24899E);
            c cVar4 = this.f24904t;
            cVar4.f24927h = iMax2;
            cVar4.f24923d += cVar4.f24924e;
            Y1(uVar, cVar4, zVar, false);
            c cVar5 = this.f24904t;
            i10 = cVar5.f24921b;
            int i20 = cVar5.f24922c;
            if (i20 > 0) {
                P2(i18, i11);
                c cVar6 = this.f24904t;
                cVar6.f24927h = i20;
                Y1(uVar, cVar6, zVar, false);
                i11 = this.f24904t.f24921b;
            }
        } else {
            O2(aVar4);
            c cVar7 = this.f24904t;
            cVar7.f24927h = iMax2;
            Y1(uVar, cVar7, zVar, false);
            c cVar8 = this.f24904t;
            i10 = cVar8.f24921b;
            int i21 = cVar8.f24923d;
            int i22 = cVar8.f24922c;
            if (i22 > 0) {
                iMax += i22;
            }
            Q2(this.f24899E);
            c cVar9 = this.f24904t;
            cVar9.f24927h = iMax;
            cVar9.f24923d += cVar9.f24924e;
            Y1(uVar, cVar9, zVar, false);
            c cVar10 = this.f24904t;
            i11 = cVar10.f24921b;
            int i23 = cVar10.f24922c;
            if (i23 > 0) {
                N2(i21, i10);
                c cVar11 = this.f24904t;
                cVar11.f24927h = i23;
                Y1(uVar, cVar11, zVar, false);
                i10 = this.f24904t.f24921b;
            }
        }
        if (O() > 0) {
            if (this.f24908x ^ this.f24909y) {
                int iO3 = o2(i10, uVar, zVar, true);
                i12 = i11 + iO3;
                i13 = i10 + iO3;
                iO2 = p2(i12, uVar, zVar, false);
            } else {
                int iP2 = p2(i11, uVar, zVar, true);
                i12 = i11 + iP2;
                i13 = i10 + iP2;
                iO2 = o2(i13, uVar, zVar, false);
            }
            i11 = i12 + iO2;
            i10 = i13 + iO2;
        }
        x2(uVar, zVar, i11, i10);
        if (zVar.e()) {
            this.f24899E.e();
        } else {
            this.f24905u.s();
        }
        this.f24906v = this.f24909y;
    }

    View b2(boolean z10, boolean z11) {
        return this.f24908x ? i2(0, O(), z10, z11) : i2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF c(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f24908x ? -1 : 1;
        return this.f24903s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        this.f24898D = null;
        this.f24895A = -1;
        this.f24896B = Integer.MIN_VALUE;
        this.f24899E.e();
    }

    View c2(boolean z10, boolean z11) {
        return this.f24908x ? i2(O() - 1, -1, z10, z11) : i2(0, O(), z10, z11);
    }

    public int d2() {
        View viewI2 = i2(0, O(), false, true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f24898D = (d) parcelable;
            x1();
        }
    }

    public int g2() {
        View viewI2 = i2(O() - 1, -1, false, true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable h1() {
        if (this.f24898D != null) {
            return new d(this.f24898D);
        }
        d dVar = new d();
        if (O() <= 0) {
            dVar.j();
            return dVar;
        }
        X1();
        boolean z10 = this.f24906v ^ this.f24908x;
        dVar.f24935c = z10;
        if (z10) {
            View viewQ2 = q2();
            dVar.f24934b = this.f24905u.i() - this.f24905u.d(viewQ2);
            dVar.f24933a = l0(viewQ2);
            return dVar;
        }
        View viewR2 = r2();
        dVar.f24933a = l0(viewR2);
        dVar.f24934b = this.f24905u.g(viewR2) - this.f24905u.m();
        return dVar;
    }

    View h2(int i10, int i11) {
        int i12;
        int i13;
        X1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f24905u.g(N(i10)) < this.f24905u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f24903s == 0 ? this.f25064e.a(i10, i11, i12, i13) : this.f25065f.a(i10, i11, i12, i13);
    }

    View i2(int i10, int i11, boolean z10, boolean z11) {
        X1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f24903s == 0 ? this.f25064e.a(i10, i11, i12, i13) : this.f25065f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l(String str) {
        if (this.f24898D == null) {
            super.l(str);
        }
    }

    View l2(RecyclerView.u uVar, RecyclerView.z zVar, int i10, int i11, int i12) {
        X1();
        int iM = this.f24905u.m();
        int i13 = this.f24905u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewN = N(i10);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < i12) {
                if (((RecyclerView.p) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f24905u.g(viewN) < i13 && this.f24905u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.f24903s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.f24903s == 1;
    }

    protected int s2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f24905u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i10, int i11, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.f24903s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        X1();
        M2(i10 > 0 ? 1 : -1, Math.abs(i10), true, zVar);
        R1(zVar, this.f24904t, cVar);
    }

    public int t2() {
        return this.f24903s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u(int i10, RecyclerView.o.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f24898D;
        if (dVar == null || !dVar.f()) {
            E2();
            z10 = this.f24908x;
            i11 = this.f24895A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f24898D;
            z10 = dVar2.f24935c;
            i11 = dVar2.f24933a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f24901G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    protected boolean u2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return S1(zVar);
    }

    public boolean v2() {
        return this.f24910z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return T1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    void w2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int iF;
        int i10;
        int i11;
        int i12;
        int iI0;
        int iF2;
        int i13;
        int i14;
        View viewD = cVar.d(uVar);
        if (viewD == null) {
            bVar.f24917b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        if (cVar.f24931l == null) {
            if (this.f24908x == (cVar.f24925f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f24908x == (cVar.f24925f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        E0(viewD, 0, 0);
        bVar.f24916a = this.f24905u.e(viewD);
        if (this.f24903s == 1) {
            if (u2()) {
                iF2 = s0() - j0();
                iI0 = iF2 - this.f24905u.f(viewD);
            } else {
                iI0 = i0();
                iF2 = this.f24905u.f(viewD) + iI0;
            }
            if (cVar.f24925f == -1) {
                i14 = cVar.f24921b;
                i13 = i14 - bVar.f24916a;
            } else {
                i13 = cVar.f24921b;
                i14 = bVar.f24916a + i13;
            }
            int i15 = iI0;
            i12 = i13;
            i11 = i15;
            iF = i14;
            i10 = iF2;
        } else {
            int iK0 = k0();
            iF = this.f24905u.f(viewD) + iK0;
            if (cVar.f24925f == -1) {
                int i16 = cVar.f24921b;
                i11 = i16 - bVar.f24916a;
                i10 = i16;
            } else {
                int i17 = cVar.f24921b;
                i10 = bVar.f24916a + i17;
                i11 = i17;
            }
            i12 = iK0;
        }
        D0(viewD, i11, i12, i10, iF);
        if (pVar.c() || pVar.b()) {
            bVar.f24918c = true;
        }
        bVar.f24919d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return S1(zVar);
    }

    void y2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return T1(zVar);
    }
}
