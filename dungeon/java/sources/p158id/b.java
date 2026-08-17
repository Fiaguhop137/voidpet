package p158id;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f43980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f43982e;

    public b(String key, String value, Date lastUpdated, String scopeKey) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(lastUpdated, "lastUpdated");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        this.f43978a = key;
        this.f43979b = value;
        this.f43980c = lastUpdated;
        this.f43981d = scopeKey;
    }

    public final long a() {
        return this.f43982e;
    }

    public final String b() {
        return this.f43978a;
    }

    public final Date c() {
        return this.f43980c;
    }

    public final String d() {
        return this.f43981d;
    }

    public final String e() {
        return this.f43979b;
    }

    public final void f(long j10) {
        this.f43982e = j10;
    }
}
