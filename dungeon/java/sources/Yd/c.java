package Yd;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f17802h = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17795a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f functionTypeKind) {
            Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
            if (Intrinsics.b(functionTypeKind, f.a.f17809f)) {
                return c.Function;
            }
            if (Intrinsics.b(functionTypeKind, f.d.f17812f)) {
                return c.SuspendFunction;
            }
            if (Intrinsics.b(functionTypeKind, f.b.f17810f)) {
                return c.KFunction;
            }
            return Intrinsics.b(functionTypeKind, f.c.f17811f) ? c.KSuspendFunction : c.UNKNOWN;
        }
    }
}
