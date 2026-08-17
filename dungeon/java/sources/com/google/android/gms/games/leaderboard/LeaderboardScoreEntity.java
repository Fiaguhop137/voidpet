package com.google.android.gms.games.leaderboard;

import C8.b;
import android.net.Uri;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.PlayerEntity;
import p170j8.AbstractC3851p;
import p350t8.j;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardScoreEntity implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f32149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f32150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PlayerEntity f32151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f32152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f32153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f32154l;

    static int f(b bVar) {
        return AbstractC3851p.b(Long.valueOf(bVar.L2()), bVar.V1(), Long.valueOf(bVar.K2()), bVar.H1(), Long.valueOf(bVar.H2()), bVar.t3(), bVar.C3(), bVar.K3(), bVar.e0());
    }

    static boolean j(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return AbstractC3851p.a(Long.valueOf(bVar2.L2()), Long.valueOf(bVar.L2())) && AbstractC3851p.a(bVar2.V1(), bVar.V1()) && AbstractC3851p.a(Long.valueOf(bVar2.K2()), Long.valueOf(bVar.K2())) && AbstractC3851p.a(bVar2.H1(), bVar.H1()) && AbstractC3851p.a(Long.valueOf(bVar2.H2()), Long.valueOf(bVar.H2())) && AbstractC3851p.a(bVar2.t3(), bVar.t3()) && AbstractC3851p.a(bVar2.C3(), bVar.C3()) && AbstractC3851p.a(bVar2.K3(), bVar.K3()) && AbstractC3851p.a(bVar2.e0(), bVar.e0()) && AbstractC3851p.a(bVar2.v0(), bVar.v0());
    }

    static String k(b bVar) {
        return AbstractC3851p.c(bVar).a("Rank", Long.valueOf(bVar.L2())).a("DisplayRank", bVar.V1()).a("Score", Long.valueOf(bVar.K2())).a("DisplayScore", bVar.H1()).a("Timestamp", Long.valueOf(bVar.H2())).a("DisplayName", bVar.t3()).a("IconImageUri", bVar.C3()).a("IconImageUrl", bVar.getScoreHolderIconImageUrl()).a("HiResImageUri", bVar.K3()).a("HiResImageUrl", bVar.getScoreHolderHiResImageUrl()).a("Player", bVar.e0() == null ? null : bVar.e0()).a("ScoreTag", bVar.v0()).toString();
    }

    @Override // C8.b
    public final Uri C3() {
        PlayerEntity playerEntity = this.f32151i;
        return playerEntity == null ? this.f32149g : playerEntity.p();
    }

    @Override // C8.b
    public final String H1() {
        return this.f32145c;
    }

    @Override // C8.b
    public final long H2() {
        return this.f32147e;
    }

    @Override // C8.b
    public final long K2() {
        return this.f32146d;
    }

    @Override // C8.b
    public final Uri K3() {
        PlayerEntity playerEntity = this.f32151i;
        return playerEntity == null ? this.f32150h : playerEntity.U();
    }

    @Override // C8.b
    public final long L2() {
        return this.f32143a;
    }

    @Override // C8.b
    public final String V1() {
        return this.f32144b;
    }

    @Override // C8.b
    public final j e0() {
        return this.f32151i;
    }

    public final boolean equals(Object obj) {
        return j(this, obj);
    }

    @Override // C8.b
    public String getScoreHolderHiResImageUrl() {
        PlayerEntity playerEntity = this.f32151i;
        return playerEntity == null ? this.f32154l : playerEntity.getHiResImageUrl();
    }

    @Override // C8.b
    public String getScoreHolderIconImageUrl() {
        PlayerEntity playerEntity = this.f32151i;
        return playerEntity == null ? this.f32153k : playerEntity.getIconImageUrl();
    }

    public final int hashCode() {
        return f(this);
    }

    @Override // C8.b
    public final String t3() {
        PlayerEntity playerEntity = this.f32151i;
        return playerEntity == null ? this.f32148f : playerEntity.s();
    }

    public final String toString() {
        return k(this);
    }

    @Override // C8.b
    public final String v0() {
        return this.f32152j;
    }
}
