package R3;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f10851b;

    public /* synthetic */ r(String str, AtomicBoolean atomicBoolean) {
        this.f10850a = str;
        this.f10851b = atomicBoolean;
    }

    @Override // R3.P
    public final void onResult(Object obj) {
        AbstractC1373u.i(this.f10850a, this.f10851b, (C1364k) obj);
    }
}
