package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2505i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Uri f32942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f32943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f32944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f32945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f32946e;

    public C2505i4(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private C2505i4(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, B9.f fVar) {
        this.f32942a = uri;
        this.f32943b = "";
        this.f32944c = "";
        this.f32945d = z10;
        this.f32946e = z12;
    }

    public final C2505i4 a() {
        String str = this.f32943b;
        if (str.isEmpty()) {
            return new C2505i4(null, this.f32942a, str, this.f32944c, true, false, this.f32946e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C2505i4 b() {
        return new C2505i4(null, this.f32942a, this.f32943b, this.f32944c, this.f32945d, false, true, false, null);
    }

    public final AbstractC2559o4 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        int i10 = AbstractC2559o4.f33061j;
        return new C2469e4(this, str, lValueOf, true);
    }

    public final AbstractC2559o4 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i10 = AbstractC2559o4.f33061j;
        return new C2478f4(this, str, boolValueOf, true);
    }

    public final AbstractC2559o4 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i10 = AbstractC2559o4.f33061j;
        return new C2487g4(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final AbstractC2559o4 f(String str, String str2) {
        int i10 = AbstractC2559o4.f33061j;
        return new C2496h4(this, str, str2, true);
    }
}
