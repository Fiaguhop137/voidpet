package Ua;

import Rb.u;
import com.applovin.sdk.Axon;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Axon.InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f13425a;

    public /* synthetic */ a(u uVar) {
        this.f13425a = uVar;
    }

    @Override // com.applovin.sdk.Axon.InitializationListener
    public final void onInitialized() {
        b.e(this.f13425a);
    }
}
