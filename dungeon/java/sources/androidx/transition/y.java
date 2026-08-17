package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final B f25672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f25673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f25674c;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(y.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            y.e(view, f10.floatValue());
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f25672a = new J();
        } else {
            f25672a = new I();
        }
        f25673b = new a(Float.class, "translationAlpha");
        f25674c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f25672a.a(view);
    }

    static float b(View view) {
        return f25672a.b(view);
    }

    static void c(View view) {
        f25672a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f25672a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f25672a.e(view, f10);
    }

    static void f(View view, int i10) {
        f25672a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f25672a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f25672a.h(view, matrix);
    }
}
