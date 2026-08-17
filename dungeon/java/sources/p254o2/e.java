package p254o2;

import R1.r;
import U1.AbstractC1459a;
import W1.f;
import W1.j;
import W1.w;
import android.net.Uri;
import java.util.Map;
import p236n2.C4027y;
import p308r2.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50349a = C4027y.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f50350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f50352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f50354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f50355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f50356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final w f50357i;

    public e(f fVar, j jVar, int i10, r rVar, int i11, Object obj, long j10, long j11) {
        this.f50357i = new w(fVar);
        this.f50350b = (j) AbstractC1459a.e(jVar);
        this.f50351c = i10;
        this.f50352d = rVar;
        this.f50353e = i11;
        this.f50354f = obj;
        this.f50355g = j10;
        this.f50356h = j11;
    }

    public final long b() {
        return this.f50357i.p();
    }

    public final long d() {
        return this.f50356h - this.f50355g;
    }

    public final Map e() {
        return this.f50357i.r();
    }

    public final Uri f() {
        return this.f50357i.q();
    }
}
