package com.google.android.gms.games.leaderboard;

import C8.a;
import android.net.Uri;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardEntity implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f32139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f32141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32142f;

    static int f(a aVar) {
        return AbstractC3851p.b(aVar.A3(), aVar.s(), aVar.p(), Integer.valueOf(aVar.T0()), aVar.B2());
    }

    static boolean j(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return AbstractC3851p.a(aVar2.A3(), aVar.A3()) && AbstractC3851p.a(aVar2.s(), aVar.s()) && AbstractC3851p.a(aVar2.p(), aVar.p()) && AbstractC3851p.a(Integer.valueOf(aVar2.T0()), Integer.valueOf(aVar.T0())) && AbstractC3851p.a(aVar2.B2(), aVar.B2());
    }

    static String k(a aVar) {
        return AbstractC3851p.c(aVar).a("LeaderboardId", aVar.A3()).a("DisplayName", aVar.s()).a("IconImageUri", aVar.p()).a("IconImageUrl", aVar.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(aVar.T0())).a("Variants", aVar.B2()).toString();
    }

    @Override // C8.a
    public final String A3() {
        return this.f32137a;
    }

    @Override // C8.a
    public final ArrayList B2() {
        return new ArrayList(this.f32141e);
    }

    @Override // C8.a
    public final int T0() {
        return this.f32140d;
    }

    public final boolean equals(Object obj) {
        return j(this, obj);
    }

    @Override // C8.a
    public String getIconImageUrl() {
        return this.f32142f;
    }

    public final int hashCode() {
        return f(this);
    }

    @Override // C8.a
    public final Uri p() {
        return this.f32139c;
    }

    @Override // C8.a
    public final String s() {
        return this.f32138b;
    }

    public final String toString() {
        return k(this);
    }
}
