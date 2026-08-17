package L8;

import android.content.Context;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends p135h8.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p135h8.a.AbstractC0496a f6448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final h8.a.g f6449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p135h8.a f6450m;

    static {
        V v10 = new V();
        f6448k = v10;
        h8.a.g gVar = new h8.a.g();
        f6449l = gVar;
        f6450m = new p135h8.a("Games.API", v10, gVar);
    }

    public X(Context context, p350t8.r rVar) {
        super(context, f6450m, rVar, h8.e.a.f42660c);
    }

    @Override // p135h8.e
    public final C3840e.a f() {
        C3840e.a aVarF = super.f();
        if (n() != null) {
            String str = ((p350t8.r) n()).f54577k;
        }
        return aVarF;
    }
}
