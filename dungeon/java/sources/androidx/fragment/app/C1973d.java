package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1973d implements h1.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f23935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1975f f23936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1975f.a f23937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F.c f23938d;

    public /* synthetic */ C1973d(View view, C1975f c1975f, C1975f.a aVar, F.c cVar) {
        this.f23935a = view;
        this.f23936b = c1975f;
        this.f23937c = aVar;
        this.f23938d = cVar;
    }

    @Override // h1.d.a
    public final void onCancel() {
        C1975f.K(this.f23935a, this.f23936b, this.f23937c, this.f23938d);
    }
}
