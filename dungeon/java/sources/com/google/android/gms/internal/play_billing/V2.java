package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class V2 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final I1 f34663a = new V2();

    private V2() {
    }

    @Override // com.google.android.gms.internal.play_billing.I1
    public final boolean e(int i10) {
        W2 w10;
        if (i10 == 0) {
            w10 = W2.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            w10 = W2.PURCHASES_UPDATED_ACTION;
        } else if (i10 != 2) {
            w10 = i10 != 3 ? null : W2.ALTERNATIVE_BILLING_ACTION;
        } else {
            w10 = W2.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return w10 != null;
    }
}
