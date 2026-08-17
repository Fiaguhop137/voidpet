package Db;

import android.os.Build;
import expo.modules.image.records.DecodeFormat;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC0939c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final DecodeFormat f2391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f2392k;

    public x(DecodeFormat decodeFormat) {
        Intrinsics.checkNotNullParameter(decodeFormat, "decodeFormat");
        this.f2391j = decodeFormat;
        this.f2392k = Ad.j.b(new w());
    }

    private final int d() {
        return ((Number) this.f2392k.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, "ro.hwui.max_texture_allocation_size", 104857600);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return kotlin.ranges.e.e(((Integer) objInvoke).intValue(), 104857600);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // p436y4.l
    public y4.l.g a(int i10, int i11, int i12, int i13) {
        return y4.l.g.MEMORY;
    }

    @Override // p436y4.l
    public float b(int i10, int i11, int i12, int i13) {
        if (d() <= 0 || i10 * i11 * this.f2391j.toBytes() <= d()) {
            return 1.0f;
        }
        return (float) (((double) ((int) Math.floor(Math.sqrt(((double) (d() / this.f2391j.toBytes())) / (((double) Math.min(i10, i11)) / ((double) Math.max(i10, i11))))))) / ((double) Math.max(i10, i11)));
    }

    @Override // Db.AbstractC0939c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f2391j == ((x) obj).f2391j;
    }

    @Override // Db.AbstractC0939c
    public int hashCode() {
        return (super.hashCode() * 31) + this.f2391j.hashCode();
    }
}
