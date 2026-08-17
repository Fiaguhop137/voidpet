package G4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3929a = new ArrayList();

    /* JADX INFO: renamed from: G4.a$a, reason: collision with other inner class name */
    private static final class C0086a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f3930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p274p4.d f3931b;

        C0086a(Class cls, p274p4.d dVar) {
            this.f3930a = cls;
            this.f3931b = dVar;
        }

        boolean a(Class cls) {
            return this.f3930a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, p274p4.d dVar) {
        this.f3929a.add(new C0086a(cls, dVar));
    }

    public synchronized p274p4.d b(Class cls) {
        for (C0086a c0086a : this.f3929a) {
            if (c0086a.a(cls)) {
                return c0086a.f3931b;
            }
        }
        return null;
    }
}
