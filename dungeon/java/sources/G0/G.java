package G0;

import C0.C0819d;
import C0.InterfaceC0848s;
import C0.N0;
import C0.O0;
import C0.y0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3726d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final R.i f3727e = R.l.e(new E(), new F());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0819d f3728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N0 f3730c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private G(C0819d c0819d, long j10, N0 n10) {
        this.f3728a = c0819d;
        this.f3729b = O0.c(j10, 0, h().length());
        this.f3730c = n10 != null ? N0.b(O0.c(n10.n(), 0, h().length())) : null;
    }

    public /* synthetic */ G(C0819d c0819d, long j10, N0 n10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0819d, (i10 & 2) != 0 ? N0.f1115b.a() : j10, (i10 & 4) != 0 ? null : n10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ G(C0819d c0819d, long j10, N0 n10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0819d, j10, n10);
    }

    private G(String str, long j10, N0 n10) {
        this(new C0819d(str, null, 2, null), j10, n10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ G(String str, long j10, N0 n10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? N0.f1115b.a() : j10, (i10 & 4) != 0 ? null : n10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ G(String str, long j10, N0 n10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, n10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(R.m mVar, G g10) {
        return CollectionsKt.g(y0.a1(g10.f3728a, y0.L0(), mVar), y0.a1(N0.b(g10.f3729b), y0.M0(N0.f1115b), mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G d(Object obj) {
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        R.i iVarL0 = y0.L0();
        Boolean bool = Boolean.FALSE;
        N0 n10 = null;
        C0819d c0819d = ((!Intrinsics.b(obj2, bool) || (iVarL0 instanceof InterfaceC0848s)) && obj2 != null) ? (C0819d) iVarL0.a(obj2) : null;
        Intrinsics.c(c0819d);
        Object obj3 = list.get(1);
        R.i iVarM0 = y0.M0(N0.f1115b);
        if ((!Intrinsics.b(obj3, bool) || (iVarM0 instanceof InterfaceC0848s)) && obj3 != null) {
            n10 = (N0) iVarM0.a(obj3);
        }
        Intrinsics.c(n10);
        return new G(c0819d, n10.n(), (N0) null, 4, (DefaultConstructorMarker) null);
    }

    public final C0819d e() {
        return this.f3728a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return N0.e(this.f3729b, g10.f3729b) && Intrinsics.b(this.f3730c, g10.f3730c) && Intrinsics.b(this.f3728a, g10.f3728a);
    }

    public final N0 f() {
        return this.f3730c;
    }

    public final long g() {
        return this.f3729b;
    }

    public final String h() {
        return this.f3728a.g();
    }

    public int hashCode() {
        int iHashCode = ((this.f3728a.hashCode() * 31) + N0.l(this.f3729b)) * 31;
        N0 n10 = this.f3730c;
        return iHashCode + (n10 != null ? N0.l(n10.n()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f3728a) + "', selection=" + ((Object) N0.m(this.f3729b)) + ", composition=" + this.f3730c + ')';
    }
}
