package p148i3;

import androidx.profileinstaller.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.c f43743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43745c;

    public /* synthetic */ b(f.c cVar, int i10, Object obj) {
        this.f43743a = cVar;
        this.f43744b = i10;
        this.f43745c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43743a.a(this.f43744b, this.f43745c);
    }
}
