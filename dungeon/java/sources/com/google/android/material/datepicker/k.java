package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0;
import androidx.core.view.H;
import androidx.core.view.Z;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h;
import androidx.fragment.app.x;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class k<S> extends DialogInterfaceOnCancelListenerC1977h {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    static final Object f36578V0 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    static final Object f36579W0 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    static final Object f36580X0 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private i f36581A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f36582B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private CharSequence f36583C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private boolean f36584D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f36585E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f36586F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private CharSequence f36587G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f36588H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private CharSequence f36589I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private int f36590J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private CharSequence f36591K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f36592L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private CharSequence f36593M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private TextView f36594N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private TextView f36595O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private CheckableImageButton f36596P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private p297q9.g f36597Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private Button f36598R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f36599S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private CharSequence f36600T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private CharSequence f36601U0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final LinkedHashSet f36602t0 = new LinkedHashSet();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final LinkedHashSet f36603u0 = new LinkedHashSet();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final LinkedHashSet f36604v0 = new LinkedHashSet();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final LinkedHashSet f36605w0 = new LinkedHashSet();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f36606x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private q f36607y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f36608z0;

    class a implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f36609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f36610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f36611c;

        a(int i10, View view, int i11) {
            this.f36609a = i10;
            this.f36610b = view;
            this.f36611c = i11;
        }

        @Override // androidx.core.view.H
        public C0 a(View view, C0 c10) {
            int i10 = c10.f(C0.p.i()).f25866b;
            if (this.f36609a >= 0) {
                this.f36610b.getLayoutParams().height = this.f36609a + i10;
                View view2 = this.f36610b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f36610b;
            view3.setPadding(view3.getPaddingLeft(), this.f36611c + i10, this.f36610b.getPaddingRight(), this.f36610b.getPaddingBottom());
            return c10;
        }
    }

    class b extends p {
        b() {
        }
    }

    private void A2() {
        int iU2 = u2(G1());
        p2();
        i iVarL2 = i.l2(null, iU2, this.f36608z0, null);
        this.f36581A0 = iVarL2;
        q qVarX1 = iVarL2;
        if (this.f36585E0 == 1) {
            p2();
            qVarX1 = l.X1(null, iU2, this.f36608z0);
        }
        this.f36607y0 = qVarX1;
        C2();
        B2(s2());
        x xVarM = F().m();
        xVarM.n(Y8.e.f17143y, this.f36607y0);
        xVarM.i();
        this.f36607y0.V1(new b());
    }

    private void C2() {
        this.f36594N0.setText((this.f36585E0 == 1 && x2()) ? this.f36601U0 : this.f36600T0);
    }

    private void D2(CheckableImageButton checkableImageButton) {
        this.f36596P0.setContentDescription(this.f36585E0 == 1 ? checkableImageButton.getContext().getString(Y8.i.f17192w) : checkableImageButton.getContext().getString(Y8.i.f17194y));
    }

    public static /* synthetic */ void m2(k kVar, View view) {
        kVar.p2();
        throw null;
    }

    private static Drawable n2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, p161j.a.b(context, Y8.d.f17086b));
        stateListDrawable.addState(new int[0], p161j.a.b(context, Y8.d.f17087c));
        return stateListDrawable;
    }

    private void o2(Window window) {
        if (this.f36599S0) {
            return;
        }
        View viewFindViewById = H1().findViewById(Y8.e.f17125g);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.p.d(viewFindViewById), null);
        Z.A0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f36599S0 = true;
    }

    private d p2() {
        android.support.v4.media.session.b.a(E().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence q2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String r2() {
        p2();
        G1();
        throw null;
    }

    private static int t2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(Y8.c.f17038V);
        int i10 = m.u().f36620d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(Y8.c.f17040X) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(Y8.c.f17044a0));
    }

    private int u2(Context context) {
        int i10 = this.f36606x0;
        if (i10 != 0) {
            return i10;
        }
        p2();
        throw null;
    }

    private void v2(Context context) {
        this.f36596P0.setTag(f36580X0);
        this.f36596P0.setImageDrawable(n2(context));
        this.f36596P0.setChecked(this.f36585E0 != 0);
        Z.m0(this.f36596P0, null);
        D2(this.f36596P0);
        this.f36596P0.setOnClickListener(new j(this));
    }

    static boolean w2(Context context) {
        return z2(context, 16843277);
    }

    private boolean x2() {
        return a0().getConfiguration().orientation == 2;
    }

    static boolean y2(Context context) {
        return z2(context, Y8.a.f16971S);
    }

    static boolean z2(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p243n9.b.d(context, Y8.a.f16956D, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    void B2(String str) {
        this.f36595O0.setContentDescription(r2());
        this.f36595O0.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h, androidx.fragment.app.i
    public final void D0(Bundle bundle) {
        super.D0(bundle);
        if (bundle == null) {
            bundle = E();
        }
        this.f36606x0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f36608z0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f36582B0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f36583C0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f36585E0 = bundle.getInt("INPUT_MODE_KEY");
        this.f36586F0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36587G0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f36588H0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36589I0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f36590J0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36591K0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f36592L0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36593M0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f36583C0;
        if (text == null) {
            text = G1().getResources().getText(this.f36582B0);
        }
        this.f36600T0 = text;
        this.f36601U0 = q2(text);
    }

    @Override // androidx.fragment.app.i
    public final View H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f36584D0 ? Y8.g.f17166s : Y8.g.f17165r, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f36584D0) {
            viewInflate.findViewById(Y8.e.f17143y).setLayoutParams(new LinearLayout.LayoutParams(t2(context), -2));
        } else {
            viewInflate.findViewById(Y8.e.f17144z).setLayoutParams(new LinearLayout.LayoutParams(t2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(Y8.e.f17098C);
        this.f36595O0 = textView;
        Z.o0(textView, 1);
        this.f36596P0 = (CheckableImageButton) viewInflate.findViewById(Y8.e.f17099D);
        this.f36594N0 = (TextView) viewInflate.findViewById(Y8.e.f17100E);
        v2(context);
        this.f36598R0 = (Button) viewInflate.findViewById(Y8.e.f17122d);
        p2();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h, androidx.fragment.app.i
    public final void Z0(Bundle bundle) {
        super.Z0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f36606x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b(this.f36608z0);
        i iVar = this.f36581A0;
        m mVarG2 = iVar == null ? null : iVar.g2();
        if (mVarG2 != null) {
            bVar.b(mVarG2.f36622f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f36582B0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f36583C0);
        bundle.putInt("INPUT_MODE_KEY", this.f36585E0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f36586F0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f36587G0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36588H0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36589I0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f36590J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f36591K0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36592L0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36593M0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h, androidx.fragment.app.i
    public void a1() {
        super.a1();
        Window window = h2().getWindow();
        if (this.f36584D0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f36597Q0);
            o2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = a0().getDimensionPixelOffset(Y8.c.f17042Z);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f36597Q0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new p136h9.a(h2(), rect));
        }
        A2();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h, androidx.fragment.app.i
    public void b1() {
        this.f36607y0.W1();
        super.b1();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h
    public final Dialog d2(Bundle bundle) {
        Dialog dialog = new Dialog(G1(), u2(G1()));
        Context context = dialog.getContext();
        this.f36584D0 = w2(context);
        this.f36597Q0 = new p297q9.g(context, null, Y8.a.f16956D, Y8.j.f17217v);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, Y8.k.f17607q3, Y8.a.f16956D, Y8.j.f17217v);
        int color = typedArrayObtainStyledAttributes.getColor(Y8.k.f17616r3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f36597Q0.L(context);
        this.f36597Q0.W(ColorStateList.valueOf(color));
        this.f36597Q0.V(Z.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f36604v0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1977h, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f36605w0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) i0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public String s2() {
        p2();
        G();
        throw null;
    }
}
