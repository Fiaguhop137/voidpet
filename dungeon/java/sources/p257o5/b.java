package p257o5;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class b extends p257o5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f50417b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f50421f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f50419d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f50420e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f50418c = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f50417b) {
                ArrayList arrayList = b.this.f50420e;
                b bVar = b.this;
                bVar.f50420e = bVar.f50419d;
                b.this.f50419d = arrayList;
            }
            int size = b.this.f50420e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p257o5.a.InterfaceC0597a) b.this.f50420e.get(i10)).release();
            }
            b.this.f50420e.clear();
        }
    }

    @Override // p257o5.a
    public void a(p257o5.a.InterfaceC0597a interfaceC0597a) {
        synchronized (this.f50417b) {
            this.f50419d.remove(interfaceC0597a);
        }
    }

    @Override // p257o5.a
    public void d(p257o5.a.InterfaceC0597a interfaceC0597a) {
        if (!p257o5.a.c()) {
            interfaceC0597a.release();
            return;
        }
        synchronized (this.f50417b) {
            try {
                if (this.f50419d.contains(interfaceC0597a)) {
                    return;
                }
                this.f50419d.add(interfaceC0597a);
                boolean z10 = true;
                if (this.f50419d.size() != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f50418c.post(this.f50421f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
