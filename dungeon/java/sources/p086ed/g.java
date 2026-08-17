package p086ed;

import android.content.Context;
import expo.modules.updates.UpdatesPackage;
import p227mb.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UpdatesPackage.b f40738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40739b;

    public /* synthetic */ g(UpdatesPackage.b bVar, Context context) {
        this.f40738a = bVar;
        this.f40739b = context;
    }

    @Override // mb.h.a
    public final void a(Runnable runnable) {
        UpdatesPackage.b.g(this.f40738a, this.f40739b, runnable);
    }
}
