package p464ze;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0764a f58550f = new C0764a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f58551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f58552h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f58553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f58554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f58555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f58556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f58557e;

    /* JADX INFO: renamed from: ze.a$a, reason: collision with other inner class name */
    public static final class C0764a {
        private C0764a() {
        }

        public /* synthetic */ C0764a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f fVar = h.f58591m;
        f58551g = fVar;
        f58552h = c.f58562c.a(fVar);
    }

    private a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f58553a = cVar;
        this.f58554b = cVar2;
        this.f58555c = fVar;
        this.f58556d = bVar;
        this.f58557e = cVar3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c packageName, f callableName) {
        this(packageName, null, callableName, null, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f58553a, aVar.f58553a) && Intrinsics.b(this.f58554b, aVar.f58554b) && Intrinsics.b(this.f58555c, aVar.f58555c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f58553a.hashCode()) * 31;
        c cVar = this.f58554b;
        return ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f58555c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringsKt.H(this.f58553a.a(), '.', '/', false, 4, null));
        sb2.append("/");
        c cVar = this.f58554b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f58555c);
        return sb2.toString();
    }
}
