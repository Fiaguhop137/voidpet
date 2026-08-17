package p459z9;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: z9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4387b extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f58509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC4390e f58510c;

    C4387b(ServiceConnectionC4390e serviceConnectionC4390e, IBinder iBinder) {
        this.f58510c = serviceConnectionC4390e;
        this.f58509b = iBinder;
    }

    @Override // p459z9.A
    public final void b() {
        this.f58510c.f58512a.f58527n = (IInterface) this.f58510c.f58512a.f58522i.a(this.f58509b);
        C4391f.r(this.f58510c.f58512a);
        this.f58510c.f58512a.f58520g = false;
        Iterator it = this.f58510c.f58512a.f58517d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f58510c.f58512a.f58517d.clear();
    }
}
