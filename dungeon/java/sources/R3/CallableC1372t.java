package R3;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: R3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1372t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f10854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10857d;

    public /* synthetic */ CallableC1372t(WeakReference weakReference, Context context, int i10, String str) {
        this.f10854a = weakReference;
        this.f10855b = context;
        this.f10856c = i10;
        this.f10857d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC1373u.d(this.f10854a, this.f10855b, this.f10856c, this.f10857d);
    }
}
