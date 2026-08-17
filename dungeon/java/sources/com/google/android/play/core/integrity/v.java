package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f37286a;

    /* synthetic */ v(p369u9.d dVar) {
    }

    @Override // com.google.android.play.core.integrity.x
    public final w a() {
        p459z9.n.a(this.f37286a, Context.class);
        return new w(this.f37286a, null);
    }

    public final v b(Context context) {
        context.getClass();
        this.f37286a = context;
        return this;
    }
}
