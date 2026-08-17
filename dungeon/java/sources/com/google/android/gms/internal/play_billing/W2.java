package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public enum W2 implements H1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34671a;

    W2(int i10) {
        this.f34671a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f34671a);
    }

    public final int zza() {
        return this.f34671a;
    }
}
