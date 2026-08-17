package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.api.Status;
import p170j8.AbstractC3851p;
import p188k8.c;
import p350t8.x;
import p404w8.p;
import p458z8.e;
import p458z8.f;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class ProfileSettingsEntity extends p implements x {

    @NonNull
    public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f32089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f32093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final StockProfileImageEntity f32094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f32096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f32097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f32098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f32099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f32100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f32101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f32102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f f32103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Boolean f32104p;

    public ProfileSettingsEntity(Status status, String str, boolean z10, boolean z11, boolean z12, StockProfileImageEntity stockProfileImageEntity, boolean z13, boolean z14, int i10, boolean z15, boolean z16, int i11, int i12, boolean z17, f fVar, Boolean bool) {
        this.f32089a = status;
        this.f32090b = str;
        this.f32091c = z10;
        this.f32092d = z11;
        this.f32093e = z12;
        this.f32094f = stockProfileImageEntity;
        this.f32095g = z13;
        this.f32096h = z14;
        this.f32097i = i10;
        this.f32098j = z15;
        this.f32099k = z16;
        this.f32100l = i11;
        this.f32101m = i12;
        this.f32102n = z17;
        this.f32103o = fVar;
        this.f32104p = bool;
    }

    @Override // p350t8.x
    public final boolean G() {
        return this.f32102n;
    }

    @Override // p350t8.x
    public final Boolean L() {
        return this.f32104p;
    }

    @Override // p350t8.x
    public final p458z8.a a() {
        return this.f32094f;
    }

    @Override // p350t8.x
    public final boolean b() {
        return this.f32091c;
    }

    @Override // p350t8.x
    public final boolean c() {
        return this.f32095g;
    }

    @Override // p350t8.x
    public final boolean d() {
        return this.f32096h;
    }

    @Override // p350t8.x
    public final boolean e() {
        return this.f32098j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        x xVar = (x) obj;
        return AbstractC3851p.a(this.f32090b, xVar.zzc()) && AbstractC3851p.a(Boolean.valueOf(this.f32091c), Boolean.valueOf(xVar.b())) && AbstractC3851p.a(Boolean.valueOf(this.f32092d), Boolean.valueOf(xVar.zza())) && AbstractC3851p.a(Boolean.valueOf(this.f32093e), Boolean.valueOf(xVar.zzb())) && AbstractC3851p.a(this.f32089a, xVar.t()) && AbstractC3851p.a(this.f32094f, xVar.a()) && AbstractC3851p.a(Boolean.valueOf(this.f32095g), Boolean.valueOf(xVar.c())) && AbstractC3851p.a(Boolean.valueOf(this.f32096h), Boolean.valueOf(xVar.d())) && this.f32097i == xVar.i() && this.f32098j == xVar.e() && this.f32099k == xVar.h() && this.f32100l == xVar.k() && this.f32101m == xVar.o() && this.f32102n == xVar.G() && AbstractC3851p.a(this.f32104p, xVar.L()) && AbstractC3851p.a(this.f32103o, xVar.x());
    }

    @Override // p350t8.x
    public final boolean h() {
        return this.f32099k;
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f32090b, Boolean.valueOf(this.f32091c), Boolean.valueOf(this.f32092d), Boolean.valueOf(this.f32093e), this.f32089a, this.f32094f, Boolean.valueOf(this.f32095g), Boolean.valueOf(this.f32096h), Integer.valueOf(this.f32097i), Boolean.valueOf(this.f32098j), Boolean.valueOf(this.f32099k), Integer.valueOf(this.f32100l), Integer.valueOf(this.f32101m), Boolean.valueOf(this.f32102n), this.f32103o, this.f32104p);
    }

    @Override // p350t8.x
    public final int i() {
        return this.f32097i;
    }

    @Override // p350t8.x
    public final int k() {
        return this.f32100l;
    }

    @Override // p350t8.x
    public final int o() {
        return this.f32101m;
    }

    @Override // p135h8.k
    public final Status t() {
        return this.f32089a;
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("GamerTag", this.f32090b).a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f32091c)).a("IsProfileVisible", Boolean.valueOf(this.f32092d)).a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f32093e)).a("Status", this.f32089a).a("StockProfileImage", this.f32094f).a("IsProfileDiscoverable", Boolean.valueOf(this.f32095g)).a("AutoSignIn", Boolean.valueOf(this.f32096h)).a("httpErrorCode", Integer.valueOf(this.f32097i)).a("IsSettingsChangesProhibited", Boolean.valueOf(this.f32098j)).a("AllowFriendInvites", Boolean.valueOf(this.f32099k)).a("ProfileVisibility", Integer.valueOf(this.f32100l)).a("global_friends_list_visibility", Integer.valueOf(this.f32101m)).a("always_auto_sign_in", Boolean.valueOf(this.f32102n)).a("profileless_recall_summary", this.f32103o).a("games_streaks_enabled", this.f32104p).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.t(parcel, 1, this.f32089a, i10, false);
        c.u(parcel, 2, this.f32090b, false);
        c.c(parcel, 3, this.f32091c);
        c.c(parcel, 4, this.f32092d);
        c.c(parcel, 5, this.f32093e);
        c.t(parcel, 6, this.f32094f, i10, false);
        c.c(parcel, 7, this.f32095g);
        c.c(parcel, 8, this.f32096h);
        c.n(parcel, 9, this.f32097i);
        c.c(parcel, 10, this.f32098j);
        c.c(parcel, 11, this.f32099k);
        c.n(parcel, 12, this.f32100l);
        c.n(parcel, 13, this.f32101m);
        c.c(parcel, 14, this.f32102n);
        c.t(parcel, 15, this.f32103o, i10, false);
        c.e(parcel, 16, this.f32104p, false);
        c.b(parcel, iA);
    }

    @Override // p350t8.x
    public final f x() {
        return this.f32103o;
    }

    @Override // p350t8.x
    public final boolean zza() {
        return this.f32092d;
    }

    @Override // p350t8.x
    public final boolean zzb() {
        return this.f32093e;
    }

    @Override // p350t8.x
    public final String zzc() {
        return this.f32090b;
    }
}
