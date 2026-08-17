package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1643i0 {
    Iapkit("iapkit");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16046a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16045e = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16042b = new a(null);

    /* JADX INFO: renamed from: Xa.i0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC1643i0 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.b(value, "iapkit") && !Intrinsics.b(value, "Iapkit")) {
                throw new IllegalArgumentException("Unknown PurchaseVerificationProvider value: " + value);
            }
            return EnumC1643i0.Iapkit;
        }
    }

    EnumC1643i0(String str) {
        this.f16046a = str;
    }

    public final String g() {
        return this.f16046a;
    }
}
