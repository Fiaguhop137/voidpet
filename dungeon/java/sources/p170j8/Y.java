package p170j8;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.C2333b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class Y extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f46900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC3839d f46901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected Y(AbstractC3839d abstractC3839d, int i10, Bundle bundle) {
        super(abstractC3839d, Boolean.TRUE);
        Objects.requireNonNull(abstractC3839d);
        this.f46901f = abstractC3839d;
        this.f46899d = i10;
        this.f46900e = bundle;
    }

    @Override // p170j8.i0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f46899d;
        if (i10 != 0) {
            this.f46901f.W(1, null);
            Bundle bundle = this.f46900e;
            f(new C2333b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f46901f.W(1, null);
            f(new C2333b(8, null));
        }
    }

    protected abstract boolean e();

    protected abstract void f(C2333b c2333b);
}
