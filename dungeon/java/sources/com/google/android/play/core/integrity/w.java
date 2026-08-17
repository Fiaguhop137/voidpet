package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f37287a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p459z9.o f37288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p459z9.o f37289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p459z9.o f37290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p459z9.o f37291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p459z9.o f37292f;

    /* synthetic */ w(Context context, p369u9.e eVar) {
        p459z9.l lVarB = p459z9.m.b(context);
        this.f37288b = lVarB;
        p459z9.o oVarB = p459z9.k.b(e.f37254a);
        this.f37289c = oVarB;
        q qVar = new q(lVarB, t.f37285a);
        this.f37290d = qVar;
        p459z9.o oVarB2 = p459z9.k.b(new k(lVarB, oVarB, qVar, t.f37285a));
        this.f37291e = oVarB2;
        this.f37292f = p459z9.k.b(new d(oVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f37292f.a();
    }
}
