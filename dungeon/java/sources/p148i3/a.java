package p148i3;

import androidx.profileinstaller.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f43740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43742c;

    public /* synthetic */ a(b bVar, int i10, Object obj) {
        this.f43740a = bVar;
        this.f43741b = i10;
        this.f43742c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43740a.f24829c.a(this.f43741b, this.f43742c);
    }
}
