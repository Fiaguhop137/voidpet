package N5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7887c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f7888d = new c("UNKNOWN", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7890b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface b {
        c a(byte[] bArr, int i10);

        int b();
    }

    public c(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f7889a = name;
        this.f7890b = str;
    }

    public final String a() {
        return this.f7889a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f7889a, cVar.f7889a) && Intrinsics.b(this.f7890b, cVar.f7890b);
    }

    public int hashCode() {
        int iHashCode = this.f7889a.hashCode() * 31;
        String str = this.f7890b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f7889a;
    }
}
