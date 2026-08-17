package L3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6317c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f6318d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L3.a f6319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L3.a f6320b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        L3.a.b bVar = L3.a.b.f6307a;
        f6318d = new f(bVar, bVar);
    }

    public f(L3.a aVar, L3.a aVar2) {
        this.f6319a = aVar;
        this.f6320b = aVar2;
    }

    public final L3.a a() {
        return this.f6320b;
    }

    public final L3.a b() {
        return this.f6319a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.b(this.f6319a, fVar.f6319a) && Intrinsics.b(this.f6320b, fVar.f6320b);
    }

    public int hashCode() {
        return (this.f6319a.hashCode() * 31) + this.f6320b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f6319a + ", height=" + this.f6320b + ')';
    }
}
