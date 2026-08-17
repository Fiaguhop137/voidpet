package Bb;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f651c;

    public g(long[] timings, int[] amplitudes, long[] oldSDKPattern) {
        Intrinsics.checkNotNullParameter(timings, "timings");
        Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
        Intrinsics.checkNotNullParameter(oldSDKPattern, "oldSDKPattern");
        this.f649a = timings;
        this.f650b = amplitudes;
        this.f651c = oldSDKPattern;
    }

    public final int[] a() {
        return this.f650b;
    }

    public final long[] b() {
        return this.f651c;
    }

    public final long[] c() {
        return this.f649a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type expo.modules.haptics.arguments.HapticsVibrationType");
        g gVar = (g) obj;
        return Arrays.equals(this.f649a, gVar.f649a) && Arrays.equals(this.f650b, gVar.f650b) && Arrays.equals(this.f651c, gVar.f651c);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f649a) * 31) + Arrays.hashCode(this.f650b)) * 31) + Arrays.hashCode(this.f651c);
    }

    public String toString() {
        return "HapticsVibrationType(timings=" + Arrays.toString(this.f649a) + ", amplitudes=" + Arrays.toString(this.f650b) + ", oldSDKPattern=" + Arrays.toString(this.f651c) + ")";
    }
}
