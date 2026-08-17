package p389vb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f56323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f56324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f56325e;

    public m(List headers, int i10, String statusText, String url, boolean z10) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f56321a = headers;
        this.f56322b = i10;
        this.f56323c = statusText;
        this.f56324d = url;
        this.f56325e = z10;
    }

    public final List a() {
        return this.f56321a;
    }

    public final boolean b() {
        return this.f56325e;
    }

    public final int c() {
        return this.f56322b;
    }

    public final String d() {
        return this.f56323c;
    }

    public final String e() {
        return this.f56324d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.b(this.f56321a, mVar.f56321a) && this.f56322b == mVar.f56322b && Intrinsics.b(this.f56323c, mVar.f56323c) && Intrinsics.b(this.f56324d, mVar.f56324d) && this.f56325e == mVar.f56325e;
    }

    public int hashCode() {
        return (((((((this.f56321a.hashCode() * 31) + Integer.hashCode(this.f56322b)) * 31) + this.f56323c.hashCode()) * 31) + this.f56324d.hashCode()) * 31) + Boolean.hashCode(this.f56325e);
    }

    public String toString() {
        return "NativeResponseInit(headers=" + this.f56321a + ", status=" + this.f56322b + ", statusText=" + this.f56323c + ", url=" + this.f56324d + ", redirected=" + this.f56325e + ")";
    }
}
