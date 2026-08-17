package p419x5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements p419x5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f57402e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p419x5.a f57403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57404b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f57405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f57406d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(p419x5.a aVar) {
        this.f57403a = aVar;
    }

    @Override // p419x5.d
    public int a() {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return 0;
        }
        Intrinsics.c(aVar);
        return aVar.a();
    }

    @Override // p419x5.d
    public int b() {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return 0;
        }
        Intrinsics.c(aVar);
        return aVar.b();
    }

    @Override // p419x5.a
    public int c() {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return -1;
        }
        Intrinsics.c(aVar);
        return aVar.c();
    }

    @Override // p419x5.a
    public void clear() {
        p419x5.a aVar = this.f57403a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // p419x5.a
    public void d(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        p419x5.a aVar = this.f57403a;
        if (aVar != null) {
            aVar.d(bounds);
        }
        this.f57406d = bounds;
    }

    @Override // p419x5.a
    public int e() {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return -1;
        }
        Intrinsics.c(aVar);
        return aVar.e();
    }

    @Override // p419x5.a
    public void f(ColorFilter colorFilter) {
        p419x5.a aVar = this.f57403a;
        if (aVar != null) {
            aVar.f(colorFilter);
        }
        this.f57405c = colorFilter;
    }

    @Override // p419x5.d
    public int g() {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return 0;
        }
        Intrinsics.c(aVar);
        return aVar.g();
    }

    @Override // p419x5.a
    public boolean h(Drawable parent, Canvas canvas, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        p419x5.a aVar = this.f57403a;
        return aVar != null && aVar.h(parent, canvas, i10);
    }

    @Override // p419x5.d
    public int j() {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return 0;
        }
        Intrinsics.c(aVar);
        return aVar.j();
    }

    @Override // p419x5.a
    public void k(p419x5.a.InterfaceC0742a interfaceC0742a) {
        p419x5.a aVar = this.f57403a;
        if (aVar != null) {
            aVar.k(interfaceC0742a);
        }
    }

    @Override // p419x5.d
    public int l(int i10) {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return 0;
        }
        Intrinsics.c(aVar);
        return aVar.l(i10);
    }

    @Override // p419x5.a
    public void m(int i10) {
        p419x5.a aVar = this.f57403a;
        if (aVar != null) {
            aVar.m(i10);
        }
        this.f57404b = i10;
    }

    @Override // p419x5.d
    public int n() {
        p419x5.a aVar = this.f57403a;
        if (aVar == null) {
            return 0;
        }
        Intrinsics.c(aVar);
        return aVar.n();
    }
}
