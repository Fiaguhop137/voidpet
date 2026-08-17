package L8;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: L8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1156j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference f6472c = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1154i f6473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1162m f6474b;

    C1156j(Application application, InterfaceC1162m interfaceC1162m) {
        this.f6473a = new C1154i(this, application, null);
        this.f6474b = interfaceC1162m;
    }

    static C1156j a(Application application) {
        AtomicReference atomicReference = f6472c;
        C1156j c1156j = (C1156j) atomicReference.get();
        if (c1156j != null) {
            return c1156j;
        }
        p359u.G.a(atomicReference, null, new C1156j(application, AbstractC1166o.a(application)));
        return (C1156j) p170j8.r.l((C1156j) atomicReference.get());
    }

    public final void b() {
        Y.a("AutomaticGamesAuthenticator", "startWatching()");
        this.f6473a.a();
    }

    final /* synthetic */ InterfaceC1162m c() {
        return this.f6474b;
    }
}
