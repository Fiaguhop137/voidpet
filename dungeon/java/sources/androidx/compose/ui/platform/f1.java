package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f1 extends View implements p324s0.n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22024b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22025c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f22026d = b.f22030a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ViewOutlineProvider f22027e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f22028f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0 f22029a;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineA = ((f1) view).f22029a.a();
            Intrinsics.c(outlineA);
            outline.set(outlineA);
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22030a = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return Unit.f48228a;
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return f1.f22028f;
        }
    }
}
