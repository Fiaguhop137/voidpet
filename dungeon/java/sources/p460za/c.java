package p460za;

import M8.n;
import android.content.Intent;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;
import p108g.a;
import p108g.b;
import p170j8.r;
import p188k8.e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GmsBarcodeScanningDelegateActivity f58541a;

    public /* synthetic */ c(GmsBarcodeScanningDelegateActivity gmsBarcodeScanningDelegateActivity) {
        this.f58541a = gmsBarcodeScanningDelegateActivity;
    }

    @Override // p108g.b
    public final void a(Object obj) {
        GmsBarcodeScanningDelegateActivity gmsBarcodeScanningDelegateActivity = this.f58541a;
        a aVar = (a) obj;
        Intent intentF = aVar.f();
        if (aVar.j() == -1 && intentF != null && intentF.hasExtra("extra_barcode_result")) {
            b.a(new p406wa.a(new a((n) e.a((byte[]) r.l(intentF.getByteArrayExtra("extra_barcode_result")), n.CREATOR))), 0);
        } else {
            b.a(null, intentF != null ? intentF.getIntExtra("extra_error_code", 13) : 13);
        }
        gmsBarcodeScanningDelegateActivity.finish();
    }
}
