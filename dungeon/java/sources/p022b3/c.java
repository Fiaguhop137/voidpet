package p022b3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26223f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26225h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f26232o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26218a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26219b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f26220c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f26221d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26222e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26224g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26226i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26227j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26228k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26229l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26230m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26231n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26233p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f26234q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f26228k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f26226i) {
            return this.f26225h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f26234q;
    }

    public int c() {
        if (this.f26224g) {
            return this.f26223f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f26222e;
    }

    public float e() {
        return this.f26232o;
    }

    public int f() {
        return this.f26231n;
    }

    public int g() {
        return this.f26233p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f26218a.isEmpty() && this.f26219b.isEmpty() && this.f26220c.isEmpty() && this.f26221d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f26218a, str, 1073741824), this.f26219b, str2, 2), this.f26221d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f26220c)) {
            return 0;
        }
        return iB + (this.f26220c.size() * 4);
    }

    public int i() {
        int i10 = this.f26229l;
        if (i10 == -1 && this.f26230m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f26230m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f26226i;
    }

    public boolean k() {
        return this.f26224g;
    }

    public boolean l() {
        return this.f26227j == 1;
    }

    public boolean m() {
        return this.f26228k == 1;
    }

    public c n(int i10) {
        this.f26225h = i10;
        this.f26226i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f26229l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f26234q = z10;
        return this;
    }

    public c q(int i10) {
        this.f26223f = i10;
        this.f26224g = true;
        return this;
    }

    public c r(String str) {
        this.f26222e = str == null ? null : B9.c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f26232o = f10;
        return this;
    }

    public c t(int i10) {
        this.f26231n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f26230m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f26233p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f26220c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f26218a = str;
    }

    public void y(String str) {
        this.f26219b = str;
    }

    public void z(String str) {
        this.f26221d = str;
    }
}
