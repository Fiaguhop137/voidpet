package p423x9;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f57429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f57430c;

    p(s sVar, IBinder iBinder) {
        this.f57430c = sVar;
        this.f57429b = iBinder;
    }

    @Override // p423x9.j
    public final void a() {
        this.f57430c.f57432a.f57446m = e.h(this.f57429b);
        t.n(this.f57430c.f57432a);
        this.f57430c.f57432a.f57440g = false;
        Iterator it = this.f57430c.f57432a.f57437d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f57430c.f57432a.f57437d.clear();
    }
}
