package G1;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.A;
import androidx.fragment.app.C1975f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f3832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f3834c;

    public /* synthetic */ d(A a10, View view, Rect rect) {
        this.f3832a = a10;
        this.f3833b = view;
        this.f3834c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1975f.M(this.f3832a, this.f3833b, this.f3834c);
    }
}
