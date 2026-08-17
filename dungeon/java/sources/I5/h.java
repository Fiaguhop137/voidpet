package I5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f4992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f4995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f4996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f4997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f4998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f4999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f5000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f5001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f5002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f5003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f5004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f5005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f5006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f5007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f5008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f5009r;

    public h(k infra) {
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.f4992a = infra;
        this.f4993b = new ArrayList();
    }

    public final String a() {
        return this.f4997f;
    }

    public final String b() {
        return this.f5001j;
    }

    public final String[] c() {
        return this.f4999h;
    }

    public final String d() {
        return this.f5000i;
    }

    public final Integer e() {
        return this.f5009r;
    }

    public final Long f() {
        return this.f4995d;
    }

    public final Integer g() {
        return this.f5008q;
    }

    public final String h() {
        return this.f5006o;
    }

    public final String i() {
        return this.f5007p;
    }

    public final k j() {
        return this.f4992a;
    }

    public final List k() {
        return this.f4993b;
    }

    public final Long l() {
        return this.f5004m;
    }

    public final boolean m() {
        return this.f4994c;
    }

    public final Long n() {
        return this.f4996e;
    }

    public final String o() {
        return this.f4998g;
    }

    public final String p() {
        return this.f5005n;
    }

    public final String q() {
        return this.f5003l;
    }

    public final String r() {
        return this.f5002k;
    }

    public final void s() {
        this.f4993b.clear();
        this.f4994c = false;
        this.f4995d = null;
        this.f4996e = null;
        this.f4997f = null;
        this.f4998g = null;
        this.f4999h = null;
        this.f5000i = null;
        this.f5001j = null;
        this.f5002k = null;
        this.f5003l = null;
        this.f5004m = null;
        this.f5005n = null;
        this.f5006o = null;
        this.f5007p = null;
        this.f5008q = null;
        this.f5009r = null;
    }

    public final void t(Long l10) {
        this.f4995d = l10;
    }

    public final void u(boolean z10) {
        this.f4994c = z10;
    }

    public final void v(Long l10) {
        this.f4996e = l10;
    }
}
