package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1054m f4419a;

    private /* synthetic */ B1(InterfaceC1054m interfaceC1054m) {
        this.f4419a = interfaceC1054m;
    }

    public static final /* synthetic */ B1 a(InterfaceC1054m interfaceC1054m) {
        return new B1(interfaceC1054m);
    }

    public static InterfaceC1054m b(InterfaceC1054m interfaceC1054m) {
        return interfaceC1054m;
    }

    public static boolean c(InterfaceC1054m interfaceC1054m, Object obj) {
        return (obj instanceof B1) && Intrinsics.b(interfaceC1054m, ((B1) obj).f());
    }

    public static int d(InterfaceC1054m interfaceC1054m) {
        return interfaceC1054m.hashCode();
    }

    public static String e(InterfaceC1054m interfaceC1054m) {
        return "SkippableUpdater(composer=" + interfaceC1054m + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f4419a, obj);
    }

    public final /* synthetic */ InterfaceC1054m f() {
        return this.f4419a;
    }

    public int hashCode() {
        return d(this.f4419a);
    }

    public String toString() {
        return e(this.f4419a);
    }
}
