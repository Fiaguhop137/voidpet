package Yb;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Intent f17774c;

    public k(int i10, int i11, Intent intent) {
        this.f17772a = i10;
        this.f17773b = i11;
        this.f17774c = intent;
    }

    public final int a() {
        return this.f17772a;
    }

    public final int b() {
        return this.f17773b;
    }

    public final Intent c() {
        return this.f17774c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f17772a == kVar.f17772a && this.f17773b == kVar.f17773b && Intrinsics.b(this.f17774c, kVar.f17774c);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f17772a) * 31) + Integer.hashCode(this.f17773b)) * 31;
        Intent intent = this.f17774c;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "OnActivityResultPayload(requestCode=" + this.f17772a + ", resultCode=" + this.f17773b + ", data=" + this.f17774c + ")";
    }
}
