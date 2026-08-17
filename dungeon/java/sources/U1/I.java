package U1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class I implements InterfaceC1474p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f12862b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f12863a;

    private static final class b implements InterfaceC1474p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f12864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private I f12865b;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private void b() {
            this.f12864a = null;
            this.f12865b = null;
            I.o(this);
        }

        @Override // U1.InterfaceC1474p.a
        public void a() {
            ((Message) AbstractC1459a.e(this.f12864a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC1459a.e(this.f12864a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, I i10) {
            this.f12864a = message;
            this.f12865b = i10;
            return this;
        }
    }

    public I(Handler handler) {
        this.f12863a = handler;
    }

    private static b n() {
        b bVar;
        List list = f12862b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b(null) : (b) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(b bVar) {
        List list = f12862b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U1.InterfaceC1474p
    public InterfaceC1474p.a a(int i10) {
        return n().d(this.f12863a.obtainMessage(i10), this);
    }

    @Override // U1.InterfaceC1474p
    public boolean b(int i10) {
        AbstractC1459a.a(i10 != 0);
        return this.f12863a.hasMessages(i10);
    }

    @Override // U1.InterfaceC1474p
    public InterfaceC1474p.a c(int i10, int i11, int i12, Object obj) {
        return n().d(this.f12863a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // U1.InterfaceC1474p
    public InterfaceC1474p.a d(int i10, Object obj) {
        return n().d(this.f12863a.obtainMessage(i10, obj), this);
    }

    @Override // U1.InterfaceC1474p
    public void e(Object obj) {
        this.f12863a.removeCallbacksAndMessages(obj);
    }

    @Override // U1.InterfaceC1474p
    public Looper f() {
        return this.f12863a.getLooper();
    }

    @Override // U1.InterfaceC1474p
    public InterfaceC1474p.a g(int i10, int i11, int i12) {
        return n().d(this.f12863a.obtainMessage(i10, i11, i12), this);
    }

    @Override // U1.InterfaceC1474p
    public boolean h(Runnable runnable) {
        return this.f12863a.post(runnable);
    }

    @Override // U1.InterfaceC1474p
    public boolean i(int i10) {
        return this.f12863a.sendEmptyMessage(i10);
    }

    @Override // U1.InterfaceC1474p
    public boolean j(InterfaceC1474p.a aVar) {
        return ((b) aVar).c(this.f12863a);
    }

    @Override // U1.InterfaceC1474p
    public boolean k(int i10, long j10) {
        return this.f12863a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // U1.InterfaceC1474p
    public void l(int i10) {
        AbstractC1459a.a(i10 != 0);
        this.f12863a.removeMessages(i10);
    }
}
