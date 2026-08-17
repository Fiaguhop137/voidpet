package O1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0141a f8309b = new C0141a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8310a = new LinkedHashMap();

    /* JADX INFO: renamed from: O1.a$a, reason: collision with other inner class name */
    public static final class C0141a {
        private C0141a() {
        }

        public /* synthetic */ C0141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f8311c = new b();

        private b() {
        }

        @Override // O1.a
        public Object a(c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f8310a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && Intrinsics.b(this.f8310a, ((a) obj).f8310a);
    }

    public int hashCode() {
        return this.f8310a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f8310a + ')';
    }
}
