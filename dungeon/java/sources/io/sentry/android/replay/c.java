package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f45289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f45291c;

    public c(File video, int i10, long j10) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f45289a = video;
        this.f45290b = i10;
        this.f45291c = j10;
    }

    public final File a() {
        return this.f45289a;
    }

    public final int b() {
        return this.f45290b;
    }

    public final long c() {
        return this.f45291c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f45289a, cVar.f45289a) && this.f45290b == cVar.f45290b && this.f45291c == cVar.f45291c;
    }

    public int hashCode() {
        return (((this.f45289a.hashCode() * 31) + Integer.hashCode(this.f45290b)) * 31) + Long.hashCode(this.f45291c);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.f45289a + ", frameCount=" + this.f45290b + ", duration=" + this.f45291c + ')';
    }
}
