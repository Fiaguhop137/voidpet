package p350t8;

import android.text.TextUtils;
import java.util.ArrayList;
import p135h8.a;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements a.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54571e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f54573g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f54580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p404w8.r f54581o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54567a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54568b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54569c = 17;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f54570d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f54572f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54574h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f54575i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f54576j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f54577k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f54578l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f54579m = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f54582p = false;

    /* synthetic */ r(boolean z10, boolean z11, int i10, boolean z12, int i11, String str, ArrayList arrayList, boolean z13, boolean z14, boolean z15, String str2, int i12, int i13, String str3, p404w8.r rVar, boolean z16, byte[] bArr) {
        this.f54571e = i11;
        this.f54573g = arrayList;
        this.f54580n = str3;
        this.f54581o = rVar;
    }

    public static q a() {
        return new q(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            boolean z10 = rVar.f54567a;
            if (this.f54571e == rVar.f54571e && this.f54573g.equals(rVar.f54573g) && TextUtils.equals(null, null) && AbstractC3851p.a(this.f54580n, rVar.f54580n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f54571e + 486741695) * 961) + this.f54573g.hashCode();
        String str = this.f54580n;
        return ((((iHashCode * 887503681) + 9) * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }
}
