package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f45600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f45605f;

    public a(File file, int i10, int i11, int i12, int i13, String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f45600a = file;
        this.f45601b = i10;
        this.f45602c = i11;
        this.f45603d = i12;
        this.f45604e = i13;
        this.f45605f = mimeType;
    }

    public /* synthetic */ a(File file, int i10, int i11, int i12, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i10, i11, i12, i13, (i14 & 32) != 0 ? "video/avc" : str);
    }

    public final int a() {
        return this.f45604e;
    }

    public final File b() {
        return this.f45600a;
    }

    public final int c() {
        return this.f45603d;
    }

    public final String d() {
        return this.f45605f;
    }

    public final int e() {
        return this.f45602c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f45600a, aVar.f45600a) && this.f45601b == aVar.f45601b && this.f45602c == aVar.f45602c && this.f45603d == aVar.f45603d && this.f45604e == aVar.f45604e && Intrinsics.b(this.f45605f, aVar.f45605f);
    }

    public final int f() {
        return this.f45601b;
    }

    public int hashCode() {
        return (((((((((this.f45600a.hashCode() * 31) + Integer.hashCode(this.f45601b)) * 31) + Integer.hashCode(this.f45602c)) * 31) + Integer.hashCode(this.f45603d)) * 31) + Integer.hashCode(this.f45604e)) * 31) + this.f45605f.hashCode();
    }

    public String toString() {
        return "MuxerConfig(file=" + this.f45600a + ", recordingWidth=" + this.f45601b + ", recordingHeight=" + this.f45602c + ", frameRate=" + this.f45603d + ", bitRate=" + this.f45604e + ", mimeType=" + this.f45605f + ')';
    }
}
