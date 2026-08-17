package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f21092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f21093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f21094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f21095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f21096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f21097g;

    q0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f21094d = layoutParams;
        this.f21095e = new Rect();
        this.f21096f = new int[2];
        this.f21097g = new int[2];
        this.f21091a = context;
        View viewInflate = LayoutInflater.from(context).inflate(p144i.g.f43227s, (ViewGroup) null);
        this.f21092b = viewInflate;
        this.f21093c = (TextView) viewInflate.findViewById(p144i.f.f43202t);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = p144i.i.f43243a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f21091a.getResources().getDimensionPixelOffset(p144i.d.f43118k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f21091a.getResources().getDimensionPixelOffset(p144i.d.f43117j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f21091a.getResources().getDimensionPixelOffset(z10 ? p144i.d.f43120m : p144i.d.f43119l);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f21095e);
        Rect rect = this.f21095e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f21091a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f21095e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f21097g);
        view.getLocationOnScreen(this.f21096f);
        int[] iArr = this.f21096f;
        int i13 = iArr[0];
        int[] iArr2 = this.f21097g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f21092b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f21092b.getMeasuredHeight();
        int i15 = this.f21096f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f21095e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f21091a.getSystemService("window")).removeView(this.f21092b);
        }
    }

    boolean d() {
        return this.f21092b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f21093c.setText(charSequence);
        a(view, i10, i11, z10, this.f21094d);
        ((WindowManager) this.f21091a.getSystemService("window")).addView(this.f21092b, this.f21094d);
    }
}
