package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.GameEntity;
import p170j8.AbstractC3851p;
import p188k8.c;
import p350t8.d;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ExperienceEventEntity extends p implements p422x8.a {

    @NonNull
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GameEntity f32066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f32070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f32073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f32074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f32075k;

    ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j10, long j11, long j12, int i10, int i11) {
        this.f32065a = str;
        this.f32066b = gameEntity;
        this.f32067c = str2;
        this.f32068d = str3;
        this.f32069e = str4;
        this.f32070f = uri;
        this.f32071g = j10;
        this.f32072h = j11;
        this.f32073i = j12;
        this.f32074j = i10;
        this.f32075k = i11;
    }

    @Override // p422x8.a
    public final String a() {
        return this.f32068d;
    }

    @Override // p422x8.a
    public final Uri b() {
        return this.f32070f;
    }

    @Override // p422x8.a
    public final long c() {
        return this.f32071g;
    }

    @Override // p422x8.a
    public final long d() {
        return this.f32072h;
    }

    @Override // p422x8.a
    public final long e() {
        return this.f32073i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p422x8.a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        p422x8.a aVar = (p422x8.a) obj;
        return AbstractC3851p.a(aVar.zza(), this.f32065a) && AbstractC3851p.a(aVar.zzb(), this.f32066b) && AbstractC3851p.a(aVar.zzc(), this.f32067c) && AbstractC3851p.a(aVar.a(), this.f32068d) && AbstractC3851p.a(aVar.getIconImageUrl(), getIconImageUrl()) && AbstractC3851p.a(aVar.b(), this.f32070f) && AbstractC3851p.a(Long.valueOf(aVar.c()), Long.valueOf(this.f32071g)) && AbstractC3851p.a(Long.valueOf(aVar.d()), Long.valueOf(this.f32072h)) && AbstractC3851p.a(Long.valueOf(aVar.e()), Long.valueOf(this.f32073i)) && AbstractC3851p.a(Integer.valueOf(aVar.h()), Integer.valueOf(this.f32074j)) && AbstractC3851p.a(Integer.valueOf(aVar.i()), Integer.valueOf(this.f32075k));
    }

    @Override // p422x8.a
    public String getIconImageUrl() {
        return this.f32069e;
    }

    @Override // p422x8.a
    public final int h() {
        return this.f32074j;
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f32065a, this.f32066b, this.f32067c, this.f32068d, getIconImageUrl(), this.f32070f, Long.valueOf(this.f32071g), Long.valueOf(this.f32072h), Long.valueOf(this.f32073i), Integer.valueOf(this.f32074j), Integer.valueOf(this.f32075k));
    }

    @Override // p422x8.a
    public final int i() {
        return this.f32075k;
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("ExperienceId", this.f32065a).a("Game", this.f32066b).a("DisplayTitle", this.f32067c).a("DisplayDescription", this.f32068d).a("IconImageUrl", getIconImageUrl()).a("IconImageUri", this.f32070f).a("CreatedTimestamp", Long.valueOf(this.f32071g)).a("XpEarned", Long.valueOf(this.f32072h)).a("CurrentXp", Long.valueOf(this.f32073i)).a("Type", Integer.valueOf(this.f32074j)).a("NewLevel", Integer.valueOf(this.f32075k)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32065a;
        int iA = c.a(parcel);
        c.u(parcel, 1, str, false);
        c.t(parcel, 2, this.f32066b, i10, false);
        c.u(parcel, 3, this.f32067c, false);
        c.u(parcel, 4, this.f32068d, false);
        c.u(parcel, 5, getIconImageUrl(), false);
        c.t(parcel, 6, this.f32070f, i10, false);
        c.r(parcel, 7, this.f32071g);
        c.r(parcel, 8, this.f32072h);
        c.r(parcel, 9, this.f32073i);
        c.n(parcel, 10, this.f32074j);
        c.n(parcel, 11, this.f32075k);
        c.b(parcel, iA);
    }

    @Override // p422x8.a
    public final String zza() {
        return this.f32065a;
    }

    @Override // p422x8.a
    public final d zzb() {
        return this.f32066b;
    }

    @Override // p422x8.a
    public final String zzc() {
        return this.f32067c;
    }
}
