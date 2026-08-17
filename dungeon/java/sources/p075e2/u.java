package p075e2;

import R1.r;
import android.os.Looper;
import p003a2.D1;

/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f40354a = new a();

    class a implements u {
        a() {
        }

        @Override // p075e2.u
        public InterfaceC3263m a(t.a aVar, r rVar) {
            if (rVar.f10281s == null) {
                return null;
            }
            return new z(new InterfaceC3263m.a(new O(1), 6001));
        }

        @Override // p075e2.u
        public void b(Looper looper, D1 d10) {
        }

        @Override // p075e2.u
        public int d(r rVar) {
            return rVar.f10281s != null ? 1 : 0;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40355a = new v();

        static /* synthetic */ void a() {
        }

        void release();
    }

    InterfaceC3263m a(t.a aVar, r rVar);

    void b(Looper looper, D1 d10);

    default b c(t.a aVar, r rVar) {
        return b.f40355a;
    }

    int d(r rVar);

    default void e() {
    }

    default void release() {
    }
}
