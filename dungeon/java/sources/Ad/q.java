package Ad;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f327b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f328a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f329a;

        public b(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f329a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics.b(this.f329a, ((b) obj).f329a);
        }

        public int hashCode() {
            return this.f329a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f329a + ')';
        }
    }

    private /* synthetic */ q(Object obj) {
        this.f328a = obj;
    }

    public static final /* synthetic */ q a(Object obj) {
        return new q(obj);
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof q) && Intrinsics.b(obj, ((q) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f329a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f328a, obj);
    }

    public int hashCode() {
        return e(this.f328a);
    }

    public final /* synthetic */ Object i() {
        return this.f328a;
    }

    public String toString() {
        return h(this.f328a);
    }
}
