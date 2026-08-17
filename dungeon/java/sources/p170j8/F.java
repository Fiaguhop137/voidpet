package p170j8;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC2318k;

/* JADX INFO: loaded from: classes2.dex */
final class F extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f46875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2318k f46876b;

    F(Intent intent, InterfaceC2318k interfaceC2318k, int i10) {
        this.f46875a = intent;
        this.f46876b = interfaceC2318k;
    }

    @Override // p170j8.G
    public final void a() {
        Intent intent = this.f46875a;
        if (intent != null) {
            this.f46876b.startActivityForResult(intent, 2);
        }
    }
}
