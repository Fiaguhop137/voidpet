package p187k7;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0563a f48029f = new C0563a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q6.a f48031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f48032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f48033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48034e;

    /* JADX INFO: renamed from: k7.a$a, reason: collision with other inner class name */
    public static final class C0563a {
        private C0563a() {
        }

        public /* synthetic */ C0563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new a(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", 0.0d, 0.0d, Q6.a.DEFAULT, 12, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public a(Context context, String str, double d10, double d11, Q6.a cacheControl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        this.f48030a = str;
        this.f48031b = cacheControl;
        this.f48032c = b(context);
        this.f48033d = d10 * d11;
    }

    public /* synthetic */ a(Context context, String str, double d10, double d11, Q6.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? 0.0d : d11, (i10 & 16) != 0 ? Q6.a.DEFAULT : aVar);
    }

    private final Uri a(Context context) {
        this.f48034e = true;
        return c.f(context, this.f48030a);
    }

    private final Uri b(Context context) {
        try {
            Uri uriA = Uri.parse(this.f48030a);
            if (uriA.getScheme() == null) {
                uriA = a(context);
            }
            Intrinsics.c(uriA);
            return uriA;
        } catch (NullPointerException unused) {
            return a(context);
        }
    }

    public final Q6.a c() {
        return this.f48031b;
    }

    public final double d() {
        return this.f48033d;
    }

    public final String e() {
        return this.f48030a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.b(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (Double.compare(aVar.f48033d, this.f48033d) == 0 && g() == aVar.g() && Intrinsics.b(f(), aVar.f()) && Intrinsics.b(this.f48030a, aVar.f48030a) && this.f48031b == aVar.f48031b) {
                return true;
            }
        }
        return false;
    }

    public Uri f() {
        return this.f48032c;
    }

    public boolean g() {
        return this.f48034e;
    }

    public int hashCode() {
        return Objects.hash(f(), this.f48030a, Double.valueOf(this.f48033d), Boolean.valueOf(g()), this.f48031b);
    }
}
