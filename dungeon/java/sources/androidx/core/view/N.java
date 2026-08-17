package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f23149a;

    public /* synthetic */ N(View view) {
        this.f23149a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f23149a;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }
}
