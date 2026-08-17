package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2450c3;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f35863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2450c3 f35864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f35866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T8.G f35867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f35868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f35869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f35870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f35871i;

    /* synthetic */ t6(long j10, C2450c3 c2450c3, String str, Map map, T8.G g10, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f35863a = j10;
        this.f35864b = c2450c3;
        this.f35865c = str;
        this.f35866d = map;
        this.f35867e = g10;
        this.f35868f = j11;
        this.f35869g = j12;
        this.f35870h = j13;
        this.f35871i = i10;
    }

    public final C2930c6 a() {
        return new C2930c6(this.f35865c, this.f35866d, this.f35867e, null);
    }

    public final X5 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f35866d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f35863a;
        C2450c3 c2450c3 = this.f35864b;
        String str = this.f35865c;
        T8.G g10 = this.f35867e;
        return new X5(j10, c2450c3.a(), str, bundle, g10.zza(), this.f35869g, "");
    }

    public final long c() {
        return this.f35863a;
    }

    public final C2450c3 d() {
        return this.f35864b;
    }

    public final String e() {
        return this.f35865c;
    }

    public final T8.G f() {
        return this.f35867e;
    }

    public final long g() {
        return this.f35868f;
    }

    public final long h() {
        return this.f35870h;
    }

    public final int i() {
        return this.f35871i;
    }
}
