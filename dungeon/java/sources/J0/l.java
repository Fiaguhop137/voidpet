package J0;

import C0.AbstractC0829i;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class l extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0829i f5665a;

    public l(AbstractC0829i abstractC0829i) {
        this.f5665a = abstractC0829i;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f5665a.a();
    }
}
