package S5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p339sf.E;
import p339sf.t;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11564c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f11565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f11566b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(E response) {
            Intrinsics.checkNotNullParameter(response, "response");
            E eX = response.x();
            Integer numValueOf = eX != null ? Integer.valueOf(eX.i()) : null;
            E eX2 = response.x();
            return new d(numValueOf, eX2 != null ? eX2.s() : null);
        }
    }

    public d(Integer num, t tVar) {
        this.f11565a = num;
        this.f11566b = tVar;
    }
}
