package Ob;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8542c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f8543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8544b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(d status, boolean z10) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f8543a = status;
        this.f8544b = z10;
    }

    public final boolean a() {
        return this.f8544b;
    }

    public final d b() {
        return this.f8543a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8543a == bVar.f8543a && this.f8544b == bVar.f8544b;
    }

    public int hashCode() {
        return (this.f8543a.hashCode() * 31) + Boolean.hashCode(this.f8544b);
    }

    public String toString() {
        return "PermissionsResponse(status=" + this.f8543a + ", canAskAgain=" + this.f8544b + ")";
    }
}
