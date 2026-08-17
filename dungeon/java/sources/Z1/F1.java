package Z1;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.C1464f;
import U1.InterfaceC1466h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f17968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1464f f17969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f17970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f17971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17972f;

    public interface b {
        void D(int i10, boolean z10);

        void q(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f17975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17977e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f17973a = i10;
            this.f17974b = i11;
            this.f17975c = z10;
            this.f17976d = i12;
            this.f17977e = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        /* synthetic */ d(F1 f10, a aVar) {
            this();
        }

        public static /* synthetic */ void a(d dVar) {
            if (F1.this.f17971e == null) {
                return;
            }
            F1.this.f17969c.g(F1.this.h(((c) F1.this.f17969c.d()).f17973a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            F1.this.f17969c.e(new G1(this));
        }
    }

    public F1(Context context, b bVar, int i10, Looper looper, Looper looper2, InterfaceC1466h interfaceC1466h) {
        this.f17967a = context.getApplicationContext();
        this.f17968b = bVar;
        C1464f c1464f = new C1464f(new c(i10, 0, false, 0, 0), looper, looper2, interfaceC1466h, new B1(this));
        this.f17969c = c1464f;
        c1464f.e(new C1(this, i10));
    }

    public static /* synthetic */ c a(c cVar) {
        return cVar;
    }

    public static /* synthetic */ c b(F1 f10, c cVar) {
        d dVar = f10.f17971e;
        if (dVar != null) {
            try {
                f10.f17967a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                AbstractC1477t.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            f10.f17971e = null;
        }
        return cVar;
    }

    public static /* synthetic */ void d(F1 f10, int i10) {
        f10.f17970d = (AudioManager) AbstractC1459a.i((AudioManager) f10.f17967a.getSystemService("audio"));
        d dVar = new d(f10, null);
        try {
            f10.f17967a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            f10.f17971e = dVar;
        } catch (RuntimeException e10) {
            AbstractC1477t.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
        f10.f17969c.g(f10.h(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c h(int i10) {
        AbstractC1459a.e(this.f17970d);
        return new c(i10, S1.m.f(this.f17970d, i10), S1.m.g(this.f17970d, i10), S1.m.e(this.f17970d, i10), S1.m.d(this.f17970d, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(c cVar, c cVar2) {
        boolean z10 = cVar.f17975c;
        if (!z10 && cVar2.f17975c) {
            this.f17972f = cVar.f17974b;
        }
        int i10 = cVar.f17974b;
        int i11 = cVar2.f17974b;
        if (i10 != i11 || z10 != cVar2.f17975c) {
            this.f17968b.D(i11, cVar2.f17975c);
        }
        int i12 = cVar.f17973a;
        int i13 = cVar2.f17973a;
        if (i12 == i13 && cVar.f17976d == cVar2.f17976d && cVar.f17977e == cVar2.f17977e) {
            return;
        }
        this.f17968b.q(i13);
    }

    public int i() {
        return ((c) this.f17969c.d()).f17977e;
    }

    public int j() {
        return ((c) this.f17969c.d()).f17976d;
    }

    public void l() {
        this.f17969c.h(new D1(), new E1(this));
    }
}
