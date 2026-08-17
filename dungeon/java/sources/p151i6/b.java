package p151i6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f43757a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43758b = new C0514b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f43759c;

    public interface a {
    }

    /* JADX INFO: renamed from: i6.b$b, reason: collision with other inner class name */
    private static final class C0514b implements a {
    }

    public interface c {
        void a(String str);

        void b();

        boolean c();
    }

    private b() {
    }

    public static final void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f43757a.c().a(name);
    }

    public static final void b() {
        f43757a.c().b();
    }

    private final c c() {
        p151i6.a aVar;
        c cVar = f43759c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            aVar = new p151i6.a();
            f43759c = aVar;
        }
        return aVar;
    }

    public static final boolean d() {
        return f43757a.c().c();
    }
}
