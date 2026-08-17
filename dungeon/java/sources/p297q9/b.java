package p297q9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f51616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f51617b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f51616a;
            f10 += ((b) cVar).f51617b;
        }
        this.f51616a = cVar;
        this.f51617b = f10;
    }

    @Override // p297q9.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f51616a.a(rectF) + this.f51617b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f51616a.equals(bVar.f51616a) && this.f51617b == bVar.f51617b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51616a, Float.valueOf(this.f51617b)});
    }
}
