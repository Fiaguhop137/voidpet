package I0;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4899b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale f4900a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(String str) {
        this(g.a().b(str));
    }

    public d(Locale locale) {
        this.f4900a = locale;
    }

    public final Locale a() {
        return this.f4900a;
    }

    public final String b() {
        return h.a(this.f4900a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.b(b(), ((d) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }
}
