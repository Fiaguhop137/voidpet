package K9;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f6126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T9.a f6127b;

    public /* synthetic */ t(Map.Entry entry, T9.a aVar) {
        this.f6126a = entry;
        this.f6127b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((T9.b) this.f6126a.getKey()).a(this.f6127b);
    }
}
