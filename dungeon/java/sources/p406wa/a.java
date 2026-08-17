package p406wa;

import Aa.b;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p424xa.a f56728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f56729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Point[] f56730c;

    public a(p424xa.a aVar) {
        this(aVar, null);
    }

    public a(p424xa.a aVar, Matrix matrix) {
        this.f56728a = (p424xa.a) r.l(aVar);
        Rect rectA = aVar.a();
        if (rectA != null && matrix != null) {
            b.b(rectA, matrix);
        }
        this.f56729b = rectA;
        Point[] pointArrB = aVar.b();
        if (pointArrB != null && matrix != null) {
            b.a(pointArrB, matrix);
        }
        this.f56730c = pointArrB;
    }
}
