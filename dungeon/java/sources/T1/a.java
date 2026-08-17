package T1;

import U1.AbstractC1459a;
import U1.S;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f11944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f11945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f11946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f11947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f11951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f11953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f11954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f11955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f11958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f11959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f11960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f11936s = new b().o("").a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f11937t = S.z0(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f11938u = S.z0(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f11939v = S.z0(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f11940w = S.z0(2);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f11941x = S.z0(3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f11942y = S.z0(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f11943z = S.z0(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f11923A = S.z0(5);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f11924B = S.z0(6);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f11925C = S.z0(7);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f11926D = S.z0(8);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f11927E = S.z0(9);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f11928F = S.z0(10);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f11929G = S.z0(11);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f11930H = S.z0(12);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final String f11931I = S.z0(13);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String f11932J = S.z0(14);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final String f11933K = S.z0(15);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final String f11934L = S.z0(16);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f11935M = S.z0(19);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f11962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f11963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f11964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f11965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f11966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f11967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f11969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f11971j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f11972k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f11973l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f11974m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f11975n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f11976o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f11977p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f11978q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f11979r;

        public b() {
            this.f11962a = null;
            this.f11963b = null;
            this.f11964c = null;
            this.f11965d = null;
            this.f11966e = -3.4028235E38f;
            this.f11967f = Integer.MIN_VALUE;
            this.f11968g = Integer.MIN_VALUE;
            this.f11969h = -3.4028235E38f;
            this.f11970i = Integer.MIN_VALUE;
            this.f11971j = Integer.MIN_VALUE;
            this.f11972k = -3.4028235E38f;
            this.f11973l = -3.4028235E38f;
            this.f11974m = -3.4028235E38f;
            this.f11975n = false;
            this.f11976o = -16777216;
            this.f11977p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f11962a = aVar.f11944a;
            this.f11963b = aVar.f11947d;
            this.f11964c = aVar.f11945b;
            this.f11965d = aVar.f11946c;
            this.f11966e = aVar.f11948e;
            this.f11967f = aVar.f11949f;
            this.f11968g = aVar.f11950g;
            this.f11969h = aVar.f11951h;
            this.f11970i = aVar.f11952i;
            this.f11971j = aVar.f11957n;
            this.f11972k = aVar.f11958o;
            this.f11973l = aVar.f11953j;
            this.f11974m = aVar.f11954k;
            this.f11975n = aVar.f11955l;
            this.f11976o = aVar.f11956m;
            this.f11977p = aVar.f11959p;
            this.f11978q = aVar.f11960q;
            this.f11979r = aVar.f11961r;
        }

        /* synthetic */ b(a aVar, C0174a c0174a) {
            this(aVar);
        }

        public a a() {
            return new a(this.f11962a, this.f11964c, this.f11965d, this.f11963b, this.f11966e, this.f11967f, this.f11968g, this.f11969h, this.f11970i, this.f11971j, this.f11972k, this.f11973l, this.f11974m, this.f11975n, this.f11976o, this.f11977p, this.f11978q, this.f11979r, null);
        }

        public b b() {
            this.f11975n = false;
            return this;
        }

        public int c() {
            return this.f11968g;
        }

        public int d() {
            return this.f11970i;
        }

        public CharSequence e() {
            return this.f11962a;
        }

        public b f(Bitmap bitmap) {
            this.f11963b = bitmap;
            this.f11962a = null;
            return this;
        }

        public b g(float f10) {
            this.f11974m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f11966e = f10;
            this.f11967f = i10;
            return this;
        }

        public b i(int i10) {
            this.f11968g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f11965d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f11969h = f10;
            return this;
        }

        public b l(int i10) {
            this.f11970i = i10;
            return this;
        }

        public b m(float f10) {
            this.f11978q = f10;
            return this;
        }

        public b n(float f10) {
            this.f11973l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f11962a = charSequence;
            this.f11963b = null;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f11964c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f11972k = f10;
            this.f11971j = i10;
            return this;
        }

        public b r(int i10) {
            this.f11977p = i10;
            return this;
        }

        public b s(int i10) {
            this.f11976o = i10;
            this.f11975n = true;
            return this;
        }

        public b t(int i10) {
            this.f11979r = i10;
            return this;
        }
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16) {
        if (charSequence == null) {
            AbstractC1459a.e(bitmap);
        } else {
            AbstractC1459a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f11944a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f11944a = charSequence.toString();
        } else {
            this.f11944a = null;
        }
        this.f11945b = alignment;
        this.f11946c = alignment2;
        this.f11947d = bitmap;
        this.f11948e = f10;
        this.f11949f = i10;
        this.f11950g = i11;
        this.f11951h = f11;
        this.f11952i = i12;
        this.f11953j = f13;
        this.f11954k = f14;
        this.f11955l = z10;
        this.f11956m = i14;
        this.f11957n = i13;
        this.f11958o = f12;
        this.f11959p = i15;
        this.f11960q = f15;
        this.f11961r = i16;
    }

    /* synthetic */ a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16, C0174a c0174a) {
        this(charSequence, alignment, alignment2, bitmap, f10, i10, i11, f11, i12, i13, f12, f13, f14, z10, i14, i15, f15, i16);
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f11937t);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f11938u);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    d.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f11939v);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f11940w);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f11941x);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f11942y);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f11943z;
        if (bundle.containsKey(str)) {
            String str2 = f11923A;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f11924B;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f11925C;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f11926D;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f11928F;
        if (bundle.containsKey(str6)) {
            String str7 = f11927E;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f11929G;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f11930H;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f11931I;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f11932J, false)) {
            bVar.b();
        }
        String str11 = f11933K;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f11934L;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        String str13 = f11935M;
        if (bundle.containsKey(str13)) {
            bVar.t(bundle.getInt(str13));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f11944a;
        if (charSequence != null) {
            bundle.putCharSequence(f11937t, charSequence);
            CharSequence charSequence2 = this.f11944a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = d.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f11938u, arrayListA);
                }
            }
        }
        bundle.putSerializable(f11939v, this.f11945b);
        bundle.putSerializable(f11940w, this.f11946c);
        bundle.putFloat(f11943z, this.f11948e);
        bundle.putInt(f11923A, this.f11949f);
        bundle.putInt(f11924B, this.f11950g);
        bundle.putFloat(f11925C, this.f11951h);
        bundle.putInt(f11926D, this.f11952i);
        bundle.putInt(f11927E, this.f11957n);
        bundle.putFloat(f11928F, this.f11958o);
        bundle.putFloat(f11929G, this.f11953j);
        bundle.putFloat(f11930H, this.f11954k);
        bundle.putBoolean(f11932J, this.f11955l);
        bundle.putInt(f11931I, this.f11956m);
        bundle.putInt(f11933K, this.f11959p);
        bundle.putFloat(f11934L, this.f11960q);
        bundle.putInt(f11935M, this.f11961r);
        return bundle;
    }

    public b a() {
        return new b(this, null);
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f11947d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC1459a.g(this.f11947d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f11942y, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f11944a, aVar.f11944a) && this.f11945b == aVar.f11945b && this.f11946c == aVar.f11946c && ((bitmap = this.f11947d) != null ? !((bitmap2 = aVar.f11947d) == null || !bitmap.sameAs(bitmap2)) : aVar.f11947d == null) && this.f11948e == aVar.f11948e && this.f11949f == aVar.f11949f && this.f11950g == aVar.f11950g && this.f11951h == aVar.f11951h && this.f11952i == aVar.f11952i && this.f11953j == aVar.f11953j && this.f11954k == aVar.f11954k && this.f11955l == aVar.f11955l && this.f11956m == aVar.f11956m && this.f11957n == aVar.f11957n && this.f11958o == aVar.f11958o && this.f11959p == aVar.f11959p && this.f11960q == aVar.f11960q && this.f11961r == aVar.f11961r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f11944a, this.f11945b, this.f11946c, this.f11947d, Float.valueOf(this.f11948e), Integer.valueOf(this.f11949f), Integer.valueOf(this.f11950g), Float.valueOf(this.f11951h), Integer.valueOf(this.f11952i), Float.valueOf(this.f11953j), Float.valueOf(this.f11954k), Boolean.valueOf(this.f11955l), Integer.valueOf(this.f11956m), Integer.valueOf(this.f11957n), Float.valueOf(this.f11958o), Integer.valueOf(this.f11959p), Float.valueOf(this.f11960q), Integer.valueOf(this.f11961r));
    }
}
