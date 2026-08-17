package W5;

import android.util.Log;
import java.io.Closeable;

/* JADX INFO: renamed from: W5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1598a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z4.a.c f14714a;

    /* JADX INFO: renamed from: W5.a$a, reason: collision with other inner class name */
    class C0200a implements Z4.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y5.a f14715a;

        C0200a(Y5.a aVar) {
            this.f14715a = aVar;
        }

        @Override // Z4.a.c
        public void a(Z4.i iVar, Throwable th) {
            this.f14715a.a(iVar, th);
            Object objF = iVar.f();
            W4.a.K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF != null ? objF.getClass().getName() : "<value is null>", C1598a.d(th));
        }

        @Override // Z4.a.c
        public boolean b() {
            return this.f14715a.b();
        }
    }

    public C1598a(Y5.a aVar) {
        this.f14714a = new C0200a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    public Z4.a b(Closeable closeable) {
        return Z4.a.u(closeable, this.f14714a);
    }

    public Z4.a c(Object obj, Z4.h hVar) {
        return Z4.a.z(obj, hVar, this.f14714a);
    }
}
