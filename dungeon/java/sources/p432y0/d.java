package p432y0;

import android.os.CancellationSignal;
import p088ef.B0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0 f57728a;

    public /* synthetic */ d(B0 b10) {
        this.f57728a = b10;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        e.d(this.f57728a);
    }
}
