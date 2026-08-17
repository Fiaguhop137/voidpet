package Q3;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f9371a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f9372b = Ad.j.b(new x());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f9373c = Ad.j.b(new y());

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        return AbstractC1337c.c(kotlin.sequences.k.V(kotlin.sequences.k.h(ServiceLoader.load(InterfaceC1340f.class, InterfaceC1340f.class.getClassLoader()).iterator())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d() {
        return AbstractC1337c.c(kotlin.sequences.k.V(kotlin.sequences.k.h(ServiceLoader.load(h.class, h.class.getClassLoader()).iterator())));
    }

    public final List e() {
        return (List) f9373c.getValue();
    }

    public final List f() {
        return (List) f9372b.getValue();
    }
}
