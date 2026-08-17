package G4;

import java.util.ArrayList;
import java.util.List;
import p274p4.k;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3943a = new ArrayList();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f3944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k f3945b;

        a(Class cls, k kVar) {
            this.f3944a = cls;
            this.f3945b = kVar;
        }

        boolean a(Class cls) {
            return this.f3944a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f3943a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f3943a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f3943a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f3945b;
            }
        }
        return null;
    }
}
