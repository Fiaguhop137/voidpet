package R3;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: R3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1371s implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f10853b;

    public /* synthetic */ C1371s(String str, AtomicBoolean atomicBoolean) {
        this.f10852a = str;
        this.f10853b = atomicBoolean;
    }

    @Override // R3.P
    public final void onResult(Object obj) {
        AbstractC1373u.b(this.f10852a, this.f10853b, (Throwable) obj);
    }
}
