package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f45472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45474c;

    public j(File screenshot, long j10, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.f45472a = screenshot;
        this.f45473b = j10;
        this.f45474c = str;
    }

    public final String a() {
        return this.f45474c;
    }

    public final File b() {
        return this.f45472a;
    }

    public final long c() {
        return this.f45473b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.b(this.f45472a, jVar.f45472a) && this.f45473b == jVar.f45473b && Intrinsics.b(this.f45474c, jVar.f45474c);
    }

    public int hashCode() {
        int iHashCode = ((this.f45472a.hashCode() * 31) + Long.hashCode(this.f45473b)) * 31;
        String str = this.f45474c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.f45472a + ", timestamp=" + this.f45473b + ", screen=" + this.f45474c + ')';
    }
}
