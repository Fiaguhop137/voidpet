package p183k3;

import androidx.room.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f47874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f47875b;

    public /* synthetic */ o(d dVar, String[] strArr) {
        this.f47874a = dVar;
        this.f47875b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.b.k(this.f47874a, this.f47875b);
    }
}
