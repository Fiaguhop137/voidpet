package R3;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: R3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1365l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10839c;

    public /* synthetic */ CallableC1365l(Context context, String str, String str2) {
        this.f10837a = context;
        this.f10838b = str;
        this.f10839c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC1373u.c(this.f10837a, this.f10838b, this.f10839c);
    }
}
