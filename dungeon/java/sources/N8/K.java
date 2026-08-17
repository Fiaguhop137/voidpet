package N8;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W9.b f8000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W9.b f8001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f8002c;

    public K(Context context, B b10) {
        this.f8002c = b10;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f31571g;
        N7.t.f(context);
        L7.i iVarG = N7.t.c().g(aVar);
        if (aVar.a().contains(L7.c.b("json"))) {
            this.f8000a = new K9.w(new H(iVarG));
        }
        this.f8001b = new K9.w(new I(iVarG));
    }
}
