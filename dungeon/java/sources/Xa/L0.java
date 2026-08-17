package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15838b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J0 f15839a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public L0(I0 i10, J0 j10, K0 k10) {
        this.f15839a = j10;
    }

    public /* synthetic */ L0(I0 i10, J0 j10, K0 k10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : i10, (i11 & 2) != 0 ? null : j10, (i11 & 4) != 0 ? null : k10);
    }

    public final J0 a() {
        return this.f15839a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l10 = (L0) obj;
        l10.getClass();
        return Intrinsics.b(null, null) && Intrinsics.b(this.f15839a, l10.f15839a) && Intrinsics.b(null, null);
    }

    public int hashCode() {
        J0 j10 = this.f15839a;
        return (j10 == null ? 0 : j10.hashCode()) * 31;
    }

    public String toString() {
        return "VerifyPurchaseProps(apple=" + ((Object) null) + ", google=" + this.f15839a + ", horizon=" + ((Object) null) + ")";
    }
}
