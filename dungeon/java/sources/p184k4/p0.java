package p184k4;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.applovin.impl.r0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f48015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f48016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f48017c;

    public /* synthetic */ p0(r0 r0Var, View view, FrameLayout frameLayout) {
        this.f48015a = r0Var;
        this.f48016b = view;
        this.f48017c = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f48015a.a(this.f48016b, this.f48017c);
    }
}
