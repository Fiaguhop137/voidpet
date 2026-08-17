package O8;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class S implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W9.b f8486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W9.b f8487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H f8488c;

    public S(Context context, H h10) {
        this.f8488c = h10;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f31571g;
        N7.t.f(context);
        L7.i iVarG = N7.t.c().g(aVar);
        if (aVar.a().contains(L7.c.b("json"))) {
            this.f8486a = new K9.w(new O(iVarG));
        }
        this.f8487b = new K9.w(new P(iVarG));
    }
}
