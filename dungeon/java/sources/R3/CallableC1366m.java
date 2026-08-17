package R3;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: R3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1366m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputStream f10840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10841b;

    public /* synthetic */ CallableC1366m(InputStream inputStream, String str) {
        this.f10840a = inputStream;
        this.f10841b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC1373u.r(this.f10840a, this.f10841b);
    }
}
