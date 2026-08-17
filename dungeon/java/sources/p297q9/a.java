package p297q9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f51615a;

    public a(float f10) {
        this.f51615a = f10;
    }

    @Override // p297q9.c
    public float a(RectF rectF) {
        return this.f51615a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f51615a == ((a) obj).f51615a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f51615a)});
    }
}
