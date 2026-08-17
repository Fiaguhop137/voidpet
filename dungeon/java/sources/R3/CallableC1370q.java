package R3;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: R3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1370q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10849c;

    public /* synthetic */ CallableC1370q(Context context, String str, String str2) {
        this.f10847a = context;
        this.f10848b = str;
        this.f10849c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC1373u.o(this.f10847a, this.f10848b, this.f10849c);
    }
}
