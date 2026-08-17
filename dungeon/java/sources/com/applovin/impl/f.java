package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27992b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27993c = 1;

    /* JADX WARN: Code duplicated, block: B:24:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0034 A[RETURN] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        if (this.f27991a != fVar.f27991a) {
            return false;
        }
        String str = this.f27992b;
        String str2 = fVar.f27992b;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        int i10 = this.f27993c;
        int i11 = fVar.f27993c;
        if (i10 == 0) {
            if (i11 != 0) {
                return false;
            }
            return true;
        }
        if (i10 == 0) {
            throw null;
        }
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f27991a ? 79 : 97;
        String str = this.f27992b;
        int iHashCode = ((i10 + 59) * 59) + (str == null ? 43 : str.hashCode());
        int i11 = this.f27993c;
        return (iHashCode * 59) + (i11 != 0 ? e.a(i11) : 43);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=");
        sb2.append(this.f27991a);
        sb2.append(", advertisingId=");
        sb2.append(this.f27992b);
        sb2.append(", dntCode=");
        int i10 = this.f27993c;
        if (i10 == 1) {
            str = "NOT_SET";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "OFF";
        } else {
            str = "ON";
        }
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }
}
