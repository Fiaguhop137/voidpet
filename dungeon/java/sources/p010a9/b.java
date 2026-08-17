package p010a9;

import Y8.c;
import Y8.h;
import Y8.i;
import Y8.j;
import Y8.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.m;
import java.util.Locale;
import p243n9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f19569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f19570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f19571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f19572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f19573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f19574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f19575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f19576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f19577k;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0246a();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private Integer f19578A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private Integer f19579B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private Integer f19580C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private Boolean f19581D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f19583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f19584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f19585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f19586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f19587f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f19588g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f19589h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f19590i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f19591j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f19592k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f19593l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f19594m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Locale f19595n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private CharSequence f19596o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private CharSequence f19597p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f19598q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f19599r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Integer f19600s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Boolean f19601t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f19602u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f19603v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f19604w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Integer f19605x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f19606y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Integer f19607z;

        /* JADX INFO: renamed from: a9.b$a$a, reason: collision with other inner class name */
        class C0246a implements Parcelable.Creator {
            C0246a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f19590i = 255;
            this.f19592k = -2;
            this.f19593l = -2;
            this.f19594m = -2;
            this.f19601t = Boolean.TRUE;
        }

        a(Parcel parcel) {
            this.f19590i = 255;
            this.f19592k = -2;
            this.f19593l = -2;
            this.f19594m = -2;
            this.f19601t = Boolean.TRUE;
            this.f19582a = parcel.readInt();
            this.f19583b = (Integer) parcel.readSerializable();
            this.f19584c = (Integer) parcel.readSerializable();
            this.f19585d = (Integer) parcel.readSerializable();
            this.f19586e = (Integer) parcel.readSerializable();
            this.f19587f = (Integer) parcel.readSerializable();
            this.f19588g = (Integer) parcel.readSerializable();
            this.f19589h = (Integer) parcel.readSerializable();
            this.f19590i = parcel.readInt();
            this.f19591j = parcel.readString();
            this.f19592k = parcel.readInt();
            this.f19593l = parcel.readInt();
            this.f19594m = parcel.readInt();
            this.f19596o = parcel.readString();
            this.f19597p = parcel.readString();
            this.f19598q = parcel.readInt();
            this.f19600s = (Integer) parcel.readSerializable();
            this.f19602u = (Integer) parcel.readSerializable();
            this.f19603v = (Integer) parcel.readSerializable();
            this.f19604w = (Integer) parcel.readSerializable();
            this.f19605x = (Integer) parcel.readSerializable();
            this.f19606y = (Integer) parcel.readSerializable();
            this.f19607z = (Integer) parcel.readSerializable();
            this.f19580C = (Integer) parcel.readSerializable();
            this.f19578A = (Integer) parcel.readSerializable();
            this.f19579B = (Integer) parcel.readSerializable();
            this.f19601t = (Boolean) parcel.readSerializable();
            this.f19595n = (Locale) parcel.readSerializable();
            this.f19581D = (Boolean) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f19582a);
            parcel.writeSerializable(this.f19583b);
            parcel.writeSerializable(this.f19584c);
            parcel.writeSerializable(this.f19585d);
            parcel.writeSerializable(this.f19586e);
            parcel.writeSerializable(this.f19587f);
            parcel.writeSerializable(this.f19588g);
            parcel.writeSerializable(this.f19589h);
            parcel.writeInt(this.f19590i);
            parcel.writeString(this.f19591j);
            parcel.writeInt(this.f19592k);
            parcel.writeInt(this.f19593l);
            parcel.writeInt(this.f19594m);
            CharSequence charSequence = this.f19596o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f19597p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f19598q);
            parcel.writeSerializable(this.f19600s);
            parcel.writeSerializable(this.f19602u);
            parcel.writeSerializable(this.f19603v);
            parcel.writeSerializable(this.f19604w);
            parcel.writeSerializable(this.f19605x);
            parcel.writeSerializable(this.f19606y);
            parcel.writeSerializable(this.f19607z);
            parcel.writeSerializable(this.f19580C);
            parcel.writeSerializable(this.f19578A);
            parcel.writeSerializable(this.f19579B);
            parcel.writeSerializable(this.f19601t);
            parcel.writeSerializable(this.f19595n);
            parcel.writeSerializable(this.f19581D);
        }
    }

    b(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f19568b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f19582a = i10;
        }
        TypedArray typedArrayC = c(context, aVar.f19582a, i11, i12);
        Resources resources = context.getResources();
        this.f19569c = typedArrayC.getDimensionPixelSize(k.f17310K, -1);
        this.f19575i = context.getResources().getDimensionPixelSize(c.f17034R);
        this.f19576j = context.getResources().getDimensionPixelSize(c.f17036T);
        this.f19570d = typedArrayC.getDimensionPixelSize(k.f17400U, -1);
        this.f19571e = typedArrayC.getDimension(k.f17382S, resources.getDimension(c.f17077s));
        this.f19573g = typedArrayC.getDimension(k.f17427X, resources.getDimension(c.f17078t));
        this.f19572f = typedArrayC.getDimension(k.f17301J, resources.getDimension(c.f17077s));
        this.f19574h = typedArrayC.getDimension(k.f17391T, resources.getDimension(c.f17078t));
        boolean z10 = true;
        this.f19577k = typedArrayC.getInt(k.f17495e0, 1);
        aVar2.f19590i = aVar.f19590i == -2 ? 255 : aVar.f19590i;
        if (aVar.f19592k != -2) {
            aVar2.f19592k = aVar.f19592k;
        } else if (typedArrayC.hasValue(k.f17485d0)) {
            aVar2.f19592k = typedArrayC.getInt(k.f17485d0, 0);
        } else {
            aVar2.f19592k = -1;
        }
        if (aVar.f19591j != null) {
            aVar2.f19591j = aVar.f19591j;
        } else if (typedArrayC.hasValue(k.f17337N)) {
            aVar2.f19591j = typedArrayC.getString(k.f17337N);
        }
        aVar2.f19596o = aVar.f19596o;
        aVar2.f19597p = aVar.f19597p == null ? context.getString(i.f17179j) : aVar.f19597p;
        aVar2.f19598q = aVar.f19598q == 0 ? h.f17167a : aVar.f19598q;
        aVar2.f19599r = aVar.f19599r == 0 ? i.f17184o : aVar.f19599r;
        if (aVar.f19601t != null && !aVar.f19601t.booleanValue()) {
            z10 = false;
        }
        aVar2.f19601t = Boolean.valueOf(z10);
        aVar2.f19593l = aVar.f19593l == -2 ? typedArrayC.getInt(k.f17465b0, -2) : aVar.f19593l;
        aVar2.f19594m = aVar.f19594m == -2 ? typedArrayC.getInt(k.f17475c0, -2) : aVar.f19594m;
        aVar2.f19586e = Integer.valueOf(aVar.f19586e == null ? typedArrayC.getResourceId(k.f17319L, j.f17196a) : aVar.f19586e.intValue());
        aVar2.f19587f = Integer.valueOf(aVar.f19587f == null ? typedArrayC.getResourceId(k.f17328M, 0) : aVar.f19587f.intValue());
        aVar2.f19588g = Integer.valueOf(aVar.f19588g == null ? typedArrayC.getResourceId(k.f17409V, j.f17196a) : aVar.f19588g.intValue());
        aVar2.f19589h = Integer.valueOf(aVar.f19589h == null ? typedArrayC.getResourceId(k.f17418W, 0) : aVar.f19589h.intValue());
        aVar2.f19583b = Integer.valueOf(aVar.f19583b == null ? J(context, typedArrayC, k.f17283H) : aVar.f19583b.intValue());
        aVar2.f19585d = Integer.valueOf(aVar.f19585d == null ? typedArrayC.getResourceId(k.f17346O, j.f17198c) : aVar.f19585d.intValue());
        if (aVar.f19584c != null) {
            aVar2.f19584c = aVar.f19584c;
        } else if (typedArrayC.hasValue(k.f17355P)) {
            aVar2.f19584c = Integer.valueOf(J(context, typedArrayC, k.f17355P));
        } else {
            aVar2.f19584c = Integer.valueOf(new d(context, aVar2.f19585d.intValue()).i().getDefaultColor());
        }
        aVar2.f19600s = Integer.valueOf(aVar.f19600s == null ? typedArrayC.getInt(k.f17292I, 8388661) : aVar.f19600s.intValue());
        aVar2.f19602u = Integer.valueOf(aVar.f19602u == null ? typedArrayC.getDimensionPixelSize(k.f17373R, resources.getDimensionPixelSize(c.f17035S)) : aVar.f19602u.intValue());
        aVar2.f19603v = Integer.valueOf(aVar.f19603v == null ? typedArrayC.getDimensionPixelSize(k.f17364Q, resources.getDimensionPixelSize(c.f17079u)) : aVar.f19603v.intValue());
        aVar2.f19604w = Integer.valueOf(aVar.f19604w == null ? typedArrayC.getDimensionPixelOffset(k.f17436Y, 0) : aVar.f19604w.intValue());
        aVar2.f19605x = Integer.valueOf(aVar.f19605x == null ? typedArrayC.getDimensionPixelOffset(k.f17505f0, 0) : aVar.f19605x.intValue());
        aVar2.f19606y = Integer.valueOf(aVar.f19606y == null ? typedArrayC.getDimensionPixelOffset(k.f17445Z, aVar2.f19604w.intValue()) : aVar.f19606y.intValue());
        aVar2.f19607z = Integer.valueOf(aVar.f19607z == null ? typedArrayC.getDimensionPixelOffset(k.f17514g0, aVar2.f19605x.intValue()) : aVar.f19607z.intValue());
        aVar2.f19580C = Integer.valueOf(aVar.f19580C == null ? typedArrayC.getDimensionPixelOffset(k.f17455a0, 0) : aVar.f19580C.intValue());
        aVar2.f19578A = Integer.valueOf(aVar.f19578A == null ? 0 : aVar.f19578A.intValue());
        aVar2.f19579B = Integer.valueOf(aVar.f19579B == null ? 0 : aVar.f19579B.intValue());
        aVar2.f19581D = Boolean.valueOf(aVar.f19581D == null ? typedArrayC.getBoolean(k.f17274G, false) : aVar.f19581D.booleanValue());
        typedArrayC.recycle();
        if (aVar.f19595n == null) {
            aVar2.f19595n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f19595n = aVar.f19595n;
        }
        this.f19567a = aVar;
    }

    private static int J(Context context, TypedArray typedArray, int i10) {
        return p243n9.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray c(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = com.google.android.material.drawable.d.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return m.i(context, attributeSetI, k.f17265F, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    a A() {
        return this.f19567a;
    }

    String B() {
        return this.f19568b.f19591j;
    }

    int C() {
        return this.f19568b.f19585d.intValue();
    }

    int D() {
        return this.f19568b.f19607z.intValue();
    }

    int E() {
        return this.f19568b.f19605x.intValue();
    }

    boolean F() {
        return this.f19568b.f19592k != -1;
    }

    boolean G() {
        return this.f19568b.f19591j != null;
    }

    boolean H() {
        return this.f19568b.f19581D.booleanValue();
    }

    boolean I() {
        return this.f19568b.f19601t.booleanValue();
    }

    void K(int i10) {
        this.f19567a.f19590i = i10;
        this.f19568b.f19590i = i10;
    }

    void L(int i10) {
        this.f19567a.f19583b = Integer.valueOf(i10);
        this.f19568b.f19583b = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f19567a.f19584c = Integer.valueOf(i10);
        this.f19568b.f19584c = Integer.valueOf(i10);
    }

    void N(int i10) {
        this.f19567a.f19592k = i10;
        this.f19568b.f19592k = i10;
    }

    void O(String str) {
        this.f19567a.f19591j = str;
        this.f19568b.f19591j = str;
    }

    void P(boolean z10) {
        this.f19567a.f19601t = Boolean.valueOf(z10);
        this.f19568b.f19601t = Boolean.valueOf(z10);
    }

    void a() {
        N(-1);
    }

    void b() {
        O(null);
    }

    int d() {
        return this.f19568b.f19578A.intValue();
    }

    int e() {
        return this.f19568b.f19579B.intValue();
    }

    int f() {
        return this.f19568b.f19590i;
    }

    int g() {
        return this.f19568b.f19583b.intValue();
    }

    int h() {
        return this.f19568b.f19600s.intValue();
    }

    int i() {
        return this.f19568b.f19602u.intValue();
    }

    int j() {
        return this.f19568b.f19587f.intValue();
    }

    int k() {
        return this.f19568b.f19586e.intValue();
    }

    int l() {
        return this.f19568b.f19584c.intValue();
    }

    int m() {
        return this.f19568b.f19603v.intValue();
    }

    int n() {
        return this.f19568b.f19589h.intValue();
    }

    int o() {
        return this.f19568b.f19588g.intValue();
    }

    int p() {
        return this.f19568b.f19599r;
    }

    CharSequence q() {
        return this.f19568b.f19596o;
    }

    CharSequence r() {
        return this.f19568b.f19597p;
    }

    int s() {
        return this.f19568b.f19598q;
    }

    int t() {
        return this.f19568b.f19606y.intValue();
    }

    int u() {
        return this.f19568b.f19604w.intValue();
    }

    int v() {
        return this.f19568b.f19580C.intValue();
    }

    int w() {
        return this.f19568b.f19593l;
    }

    int x() {
        return this.f19568b.f19594m;
    }

    int y() {
        return this.f19568b.f19592k;
    }

    Locale z() {
        return this.f19568b.f19595n;
    }
}
