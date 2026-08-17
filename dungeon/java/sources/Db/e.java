package Db;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f2270a;

    public e(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f2270a = drawable;
    }

    @Override // Db.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Gb.b a() {
        return new Gb.b(this.f2270a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.b(this.f2270a, ((e) obj).f2270a);
    }

    public int hashCode() {
        return this.f2270a.hashCode();
    }

    public String toString() {
        return "DecodedModelProvider(drawable=" + this.f2270a + ")";
    }
}
