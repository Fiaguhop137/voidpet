package p062d7;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p348t6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends Animation implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f39862j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f39863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f39864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f39866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39871i;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b.a("PositionAndSizeAnimation", p348t6.a.ERROR);
    }

    public n(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f39863a = new WeakReference(view);
        c(i10, i11, i12, i13);
    }

    private final void c(int i10, int i11, int i12, int i13) {
        View view = (View) this.f39863a.get();
        if (view != null) {
            this.f39864b = view.getX() - view.getTranslationX();
            this.f39865c = view.getY() - view.getTranslationY();
            this.f39868f = view.getWidth();
            int height = view.getHeight();
            this.f39869g = height;
            this.f39866d = i10 - this.f39864b;
            this.f39867e = i11 - this.f39865c;
            this.f39870h = i12 - this.f39868f;
            this.f39871i = i13 - height;
        }
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        View view = (View) this.f39863a.get();
        if (view != null) {
            float f11 = this.f39864b + (this.f39866d * f10);
            float f12 = this.f39865c + (this.f39867e * f10);
            view.layout(Math.round(f11), Math.round(f12), Math.round(f11 + this.f39868f + (this.f39870h * f10)), Math.round(f12 + this.f39869g + (this.f39871i * f10)));
        }
    }

    @Override // p062d7.k
    public void b(int i10, int i11, int i12, int i13) {
        c(i10, i11, i12, i13);
    }

    @Override // p062d7.k
    public boolean isValid() {
        return this.f39863a.get() != null;
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
