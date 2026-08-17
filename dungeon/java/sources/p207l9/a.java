package p207l9;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f48688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f48689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f48690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f48691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f48692e;

    public a(View view) {
        this.f48689b = view;
        Context context = view.getContext();
        this.f48688a = d.g(context, Y8.a.f16969Q, p235n1.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f48690c = d.f(context, Y8.a.f16960H, 300);
        this.f48691d = d.f(context, Y8.a.f16963K, 150);
        this.f48692e = d.f(context, Y8.a.f16962J, 100);
    }
}
