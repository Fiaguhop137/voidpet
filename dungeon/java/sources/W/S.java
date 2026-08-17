package W;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class S implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AutofillManager f14419a;

    public S(AutofillManager autofillManager) {
        this.f14419a = autofillManager;
    }

    @Override // W.M
    public void a(View view, int i10, AutofillValue autofillValue) {
        this.f14419a.notifyValueChanged(view, i10, autofillValue);
    }

    @Override // W.M
    public void b(View view, int i10) {
        this.f14419a.notifyViewExited(view, i10);
    }

    @Override // W.M
    public void c(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            z.f14440a.a(view, this.f14419a, i10, z10);
        }
    }

    @Override // W.M
    public void commit() {
        this.f14419a.commit();
    }

    @Override // W.M
    public void d(View view, int i10, Rect rect) {
        this.f14419a.notifyViewEntered(view, i10, rect);
    }
}
