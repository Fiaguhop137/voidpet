package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.AbstractC3851p;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends p implements m {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54586d;

    public v(int i10, String str, String str2, String str3) {
        this.f54583a = i10;
        this.f54584b = str;
        this.f54585c = str2;
        this.f54586d = str3;
    }

    public v(m mVar) {
        this.f54583a = mVar.s0();
        this.f54584b = mVar.zza();
        this.f54585c = mVar.zzb();
        this.f54586d = mVar.zzc();
    }

    static int a4(m mVar) {
        return AbstractC3851p.b(Integer.valueOf(mVar.s0()), mVar.zza(), mVar.zzb(), mVar.zzc());
    }

    static boolean b4(m mVar, Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == mVar) {
            return true;
        }
        m mVar2 = (m) obj;
        return mVar2.s0() == mVar.s0() && AbstractC3851p.a(mVar2.zza(), mVar.zza()) && AbstractC3851p.a(mVar2.zzb(), mVar.zzb()) && AbstractC3851p.a(mVar2.zzc(), mVar.zzc());
    }

    static String c4(m mVar) {
        AbstractC3851p.a aVarC = AbstractC3851p.c(mVar);
        aVarC.a("FriendStatus", Integer.valueOf(mVar.s0()));
        if (mVar.zza() != null) {
            aVarC.a("Nickname", mVar.zza());
        }
        if (mVar.zzb() != null) {
            aVarC.a("InvitationNickname", mVar.zzb());
        }
        if (mVar.zzc() != null) {
            aVarC.a("NicknameAbuseReportToken", mVar.zzb());
        }
        return aVarC.toString();
    }

    public final boolean equals(Object obj) {
        return b4(this, obj);
    }

    @Override // p153i8.a
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public final int hashCode() {
        return a4(this);
    }

    @Override // p350t8.m
    public final int s0() {
        return this.f54583a;
    }

    public final String toString() {
        return c4(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w.a(this, parcel, i10);
    }

    @Override // p350t8.m
    public final String zza() {
        return this.f54584b;
    }

    @Override // p350t8.m
    public final String zzb() {
        return this.f54585c;
    }

    @Override // p350t8.m
    public final String zzc() {
        return this.f54586d;
    }
}
