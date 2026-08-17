package p335sb;

import Ad.j;
import android.app.Activity;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements p030bb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f53469a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList f53470b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f53471c = j.b(C0652b.f53475a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53472d = 8;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f53474b;

        public a(String name, boolean z10) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f53473a = name;
            this.f53474b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f53473a, aVar.f53473a) && this.f53474b == aVar.f53474b;
        }

        public int hashCode() {
            return (this.f53473a.hashCode() * 31) + Boolean.hashCode(this.f53474b);
        }

        public String toString() {
            return "Callback(name=" + this.f53473a + ", shouldCollapse=" + this.f53474b + ")";
        }
    }

    /* JADX INFO: renamed from: sb.b$b, reason: collision with other inner class name */
    static final class C0652b implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0652b f53475a = new C0652b();

        C0652b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            throw new IllegalStateException("DevMenu isn't available in release builds");
        }
    }

    private b() {
    }

    @Override // p030bb.a
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public void b() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final ArrayList c() {
        return f53470b;
    }

    public void d() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void e() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }
}
