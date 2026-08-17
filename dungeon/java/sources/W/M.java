package W;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public interface M {
    void a(View view, int i10, AutofillValue autofillValue);

    void b(View view, int i10);

    void c(View view, int i10, boolean z10);

    void commit();

    void d(View view, int i10, Rect rect);
}
