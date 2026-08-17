package Af;

import If.InterfaceC1108j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p339sf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0008a f347c = new C0008a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1108j f348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f349b;

    /* JADX INFO: renamed from: Af.a$a, reason: collision with other inner class name */
    public static final class C0008a {
        private C0008a() {
        }

        public /* synthetic */ C0008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(InterfaceC1108j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f348a = source;
        this.f349b = 262144L;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strK0 = this.f348a.K0(this.f349b);
        this.f349b -= (long) strK0.length();
        return strK0;
    }
}
