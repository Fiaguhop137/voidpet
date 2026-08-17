package L0;

import android.graphics.Paint;
import p037c0.y0;
import p037c0.z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Paint.Cap a(int i10) {
        y0.a aVar = y0.f26749a;
        if (y0.e(i10, aVar.a())) {
            return Paint.Cap.BUTT;
        }
        if (y0.e(i10, aVar.b())) {
            return Paint.Cap.ROUND;
        }
        return y0.e(i10, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i10) {
        z0.a aVar = z0.f26753a;
        if (z0.e(i10, aVar.b())) {
            return Paint.Join.MITER;
        }
        if (z0.e(i10, aVar.c())) {
            return Paint.Join.ROUND;
        }
        return z0.e(i10, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
