package T8;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C3032q2;
import com.google.android.gms.measurement.internal.X2;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f12354a;

    public n(m mVar) {
        p170j8.r.l(mVar);
        this.f12354a = mVar;
    }

    public final void a(Context context, Intent intent) {
        X2 x2O = X2.O(context, null, null);
        C3032q2 c3032q2A = x2O.a();
        if (intent == null) {
            c3032q2A.r().a("Receiver called with null intent");
            return;
        }
        x2O.c();
        String action = intent.getAction();
        c3032q2A.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c3032q2A.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c3032q2A.w().a("Starting wakeful intent.");
            this.f12354a.a(context, className);
        }
    }
}
