package Xd;

import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f16263h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Lazy f16264i = Ad.j.b(f.f16262a);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return (g) g.f16264i.getValue();
        }
    }

    public g(boolean z10) {
        super(new Qe.f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g G0() {
        return new g(false, 1, null);
    }
}
