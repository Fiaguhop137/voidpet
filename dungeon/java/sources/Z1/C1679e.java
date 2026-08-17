package Z1;

import U1.InterfaceC1466h;
import U1.InterfaceC1474p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;

/* JADX INFO: renamed from: Z1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1679e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1474p f18242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18243d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1.e$a */
    final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f18244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1474p f18245b;

        public a(InterfaceC1474p interfaceC1474p, b bVar) {
            this.f18245b = interfaceC1474p;
            this.f18244a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (C1679e.this.f18243d) {
                this.f18244a.B();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f18245b.h(new RunnableC1676d(this));
            }
        }
    }

    /* JADX INFO: renamed from: Z1.e$b */
    public interface b {
        void B();
    }

    public C1679e(Context context, Looper looper, Looper looper2, b bVar, InterfaceC1466h interfaceC1466h) {
        this.f18240a = context.getApplicationContext();
        this.f18242c = interfaceC1466h.e(looper, null);
        this.f18241b = new a(interfaceC1466h.e(looper2, null), bVar);
    }

    public void d(boolean z10) {
        if (z10 == this.f18243d) {
            return;
        }
        if (z10) {
            this.f18242c.h(new RunnableC1670b(this));
            this.f18243d = true;
        } else {
            this.f18242c.h(new RunnableC1673c(this));
            this.f18243d = false;
        }
    }
}
