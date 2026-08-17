package p083ea;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f40718b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f40719a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f40718b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f40718b;
                if (dVar == null) {
                    dVar = new d();
                    f40718b = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f40719a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f40719a);
        }
        return setUnmodifiableSet;
    }
}
