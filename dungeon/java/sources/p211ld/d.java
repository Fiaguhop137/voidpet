package p211ld;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p265od.g;
import p355td.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f48704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f48705b;

    public d(g logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f48704a = logger;
    }

    @Override // p211ld.a
    public void a(WeakReference weakReference) {
        this.f48705b = weakReference;
    }

    @Override // p211ld.a
    public void b(b context) {
        b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        g.e(this.f48704a, "Sending state machine context to observer", null, 2, null);
        WeakReference weakReferenceC = c();
        if (weakReferenceC == null || (bVar = (b) weakReferenceC.get()) == null) {
            this.f48704a.c("Unable to send state machine context to observer, no observer", p265od.b.JSRuntimeError);
            return;
        }
        try {
            bVar.g(context);
            g.e(this.f48704a, "Sent state machine context to observer", null, 2, null);
        } catch (Exception e10) {
            this.f48704a.f("Could not send state machine context to observer", e10, p265od.b.JSRuntimeError);
        }
    }

    public WeakReference c() {
        return this.f48705b;
    }
}
