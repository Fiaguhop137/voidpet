package com.google.android.gms.games.leaderboard;

import C8.c;
import L8.R0;
import com.google.android.apps.common.proguard.UsedByReflection;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardVariantEntity implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f32161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f32164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f32165k;

    static int f(c cVar) {
        return AbstractC3851p.b(Integer.valueOf(cVar.B3()), Integer.valueOf(cVar.Z1()), Boolean.valueOf(cVar.h0()), Long.valueOf(cVar.J1()), cVar.c0(), Long.valueOf(cVar.s3()), cVar.N1(), Long.valueOf(cVar.a3()), cVar.zza(), cVar.zzc(), cVar.zzb());
    }

    static boolean j(c cVar, Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (cVar == obj) {
            return true;
        }
        c cVar2 = (c) obj;
        return AbstractC3851p.a(Integer.valueOf(cVar2.B3()), Integer.valueOf(cVar.B3())) && AbstractC3851p.a(Integer.valueOf(cVar2.Z1()), Integer.valueOf(cVar.Z1())) && AbstractC3851p.a(Boolean.valueOf(cVar2.h0()), Boolean.valueOf(cVar.h0())) && AbstractC3851p.a(Long.valueOf(cVar2.J1()), Long.valueOf(cVar.J1())) && AbstractC3851p.a(cVar2.c0(), cVar.c0()) && AbstractC3851p.a(Long.valueOf(cVar2.s3()), Long.valueOf(cVar.s3())) && AbstractC3851p.a(cVar2.N1(), cVar.N1()) && AbstractC3851p.a(Long.valueOf(cVar2.a3()), Long.valueOf(cVar.a3())) && AbstractC3851p.a(cVar2.zza(), cVar.zza()) && AbstractC3851p.a(cVar2.zzc(), cVar.zzc()) && AbstractC3851p.a(cVar2.zzb(), cVar.zzb());
    }

    static String k(c cVar) {
        String str;
        AbstractC3851p.a aVarA = AbstractC3851p.c(cVar).a("TimeSpan", R0.a(cVar.B3()));
        int iZ1 = cVar.Z1();
        if (iZ1 == -1) {
            str = "UNKNOWN";
        } else if (iZ1 == 0) {
            str = "PUBLIC";
        } else if (iZ1 != 1) {
            str = "SOCIAL_1P";
            if (iZ1 != 2) {
                if (iZ1 == 3) {
                    str = "FRIENDS";
                } else if (iZ1 != 4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZ1).length() + 32);
                    sb2.append("Unknown leaderboard collection: ");
                    sb2.append(iZ1);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        } else {
            str = "SOCIAL";
        }
        return aVarA.a("Collection", str).a("RawPlayerScore", cVar.h0() ? Long.valueOf(cVar.J1()) : "none").a("DisplayPlayerScore", cVar.h0() ? cVar.c0() : "none").a("PlayerRank", cVar.h0() ? Long.valueOf(cVar.s3()) : "none").a("DisplayPlayerRank", cVar.h0() ? cVar.N1() : "none").a("NumScores", Long.valueOf(cVar.a3())).a("TopPageNextToken", cVar.zza()).a("WindowPageNextToken", cVar.zzc()).a("WindowPagePrevToken", cVar.zzb()).toString();
    }

    @Override // C8.c
    public final int B3() {
        return this.f32155a;
    }

    @Override // C8.c
    public final long J1() {
        return this.f32158d;
    }

    @Override // C8.c
    public final String N1() {
        return this.f32161g;
    }

    @Override // C8.c
    public final int Z1() {
        return this.f32156b;
    }

    @Override // C8.c
    public final long a3() {
        return this.f32162h;
    }

    @Override // C8.c
    public final String c0() {
        return this.f32159e;
    }

    public final boolean equals(Object obj) {
        return j(this, obj);
    }

    @Override // C8.c
    public final boolean h0() {
        return this.f32157c;
    }

    public final int hashCode() {
        return f(this);
    }

    @Override // C8.c
    public final long s3() {
        return this.f32160f;
    }

    public final String toString() {
        return k(this);
    }

    @Override // C8.c
    public final String zza() {
        return this.f32163i;
    }

    @Override // C8.c
    public final String zzb() {
        return this.f32164j;
    }

    @Override // C8.c
    public final String zzc() {
        return this.f32165k;
    }
}
