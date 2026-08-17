package p308r2;

import U1.AbstractC1459a;
import U1.S;
import W1.f;
import W1.h;
import W1.j;
import W1.w;
import android.net.Uri;
import java.io.InputStream;
import java.util.Map;
import p236n2.C4027y;

/* JADX INFO: loaded from: classes.dex */
public final class o implements m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f52106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f52108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f52109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f52110f;

    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public o(f fVar, j jVar, int i10, a aVar) {
        this.f52108d = new w(fVar);
        this.f52106b = jVar;
        this.f52107c = i10;
        this.f52109e = aVar;
        this.f52105a = C4027y.a();
    }

    public o(f fVar, Uri uri, int i10, a aVar) {
        this(fVar, new j.b().i(uri).b(1).a(), i10, aVar);
    }

    @Override // r2.m.e
    public final void a() {
        this.f52108d.s();
        h hVar = new h(this.f52108d, this.f52106b);
        try {
            hVar.b();
            this.f52110f = this.f52109e.a((Uri) AbstractC1459a.e(this.f52108d.e()), hVar);
        } finally {
            S.m(hVar);
        }
    }

    public long b() {
        return this.f52108d.p();
    }

    @Override // r2.m.e
    public final void c() {
    }

    public Map d() {
        return this.f52108d.r();
    }

    public final Object e() {
        return this.f52110f;
    }

    public Uri f() {
        return this.f52108d.q();
    }
}
