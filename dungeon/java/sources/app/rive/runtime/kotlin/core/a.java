package app.rive.runtime.kotlin.core;

import com.android.volley.p;
import com.android.volley.u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CDNAssetLoader f25794a;

    public /* synthetic */ a(CDNAssetLoader cDNAssetLoader) {
        this.f25794a = cDNAssetLoader;
    }

    @Override // com.android.volley.p.a
    public final void a(u uVar) {
        CDNAssetLoader.loadContents$lambda$0(this.f25794a, uVar);
    }
}
