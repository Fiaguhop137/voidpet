package Xa;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f16237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f16238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f16239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f16240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f16241e;

    public z0(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5) {
        this.f16237a = function1;
        this.f16238b = function2;
        this.f16239c = function3;
        this.f16240d = function4;
        this.f16241e = function5;
    }

    public /* synthetic */ z0(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function2, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? null : function4, (i10 & 16) != 0 ? null : function5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.b(this.f16237a, z0Var.f16237a) && Intrinsics.b(this.f16238b, z0Var.f16238b) && Intrinsics.b(this.f16239c, z0Var.f16239c) && Intrinsics.b(this.f16240d, z0Var.f16240d) && Intrinsics.b(this.f16241e, z0Var.f16241e);
    }

    public int hashCode() {
        Function1 function1 = this.f16237a;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function2 = this.f16238b;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function3 = this.f16239c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function1 function4 = this.f16240d;
        int iHashCode4 = (iHashCode3 + (function4 == null ? 0 : function4.hashCode())) * 31;
        Function1 function5 = this.f16241e;
        return iHashCode4 + (function5 != null ? function5.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionHandlers(developerProvidedBillingAndroid=" + this.f16237a + ", promotedProductIOS=" + this.f16238b + ", purchaseError=" + this.f16239c + ", purchaseUpdated=" + this.f16240d + ", userChoiceBillingAndroid=" + this.f16241e + ")";
    }
}
