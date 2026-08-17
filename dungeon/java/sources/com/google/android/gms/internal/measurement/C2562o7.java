package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2562o7 implements InterfaceC2553n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f33070a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        f33070a = c2505i4B.d("measurement.add_first_launch_logging_timestamp.service", false);
        c2505i4B.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2553n7
    public final boolean zza() {
        return ((Boolean) f33070a.d()).booleanValue();
    }
}
