package Ud;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f13625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClassLoader f13627c;

    public k1(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f13625a = new WeakReference(classLoader);
        this.f13626b = System.identityHashCode(classLoader);
        this.f13627c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f13627c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k1) && this.f13625a.get() == ((k1) obj).f13625a.get();
    }

    public int hashCode() {
        return this.f13626b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f13625a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
