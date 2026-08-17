package p222m6;

import android.graphics.ColorSpace;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorSpace f49143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pair f49144b;

    public e(int i10, int i11, ColorSpace colorSpace) {
        this.f49143a = colorSpace;
        this.f49144b = (i10 == -1 || i11 == -1) ? null : new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final ColorSpace a() {
        return this.f49143a;
    }

    public final Pair b() {
        return this.f49144b;
    }
}
