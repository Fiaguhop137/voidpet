package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends AbstractC2474f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32836e;

    /* synthetic */ Y(String str, boolean z10, int i10, V v10, W w10, int i11, byte[] bArr) {
        this.f32834c = str;
        this.f32835d = i10;
        this.f32836e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2474f0
    public final String a() {
        return this.f32834c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2474f0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2474f0
    public final V c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2474f0
    public final W d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2474f0
    public final int e() {
        return this.f32835d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2474f0) {
            AbstractC2474f0 abstractC2474f0 = (AbstractC2474f0) obj;
            if (this.f32834c.equals(abstractC2474f0.a())) {
                abstractC2474f0.b();
                int i10 = this.f32835d;
                int iE = abstractC2474f0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC2474f0.c();
                    abstractC2474f0.d();
                    int i11 = this.f32836e;
                    int iF = abstractC2474f0.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2474f0
    public final int f() {
        return this.f32836e;
    }

    public final int hashCode() {
        int iHashCode = this.f32834c.hashCode() ^ 1000003;
        int i10 = this.f32835d;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f32836e != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.f32835d;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f32836e == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f32834c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
