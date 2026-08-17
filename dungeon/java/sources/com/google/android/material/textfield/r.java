package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import androidx.core.view.AbstractC1935v;
import androidx.core.view.Z;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p217m1.AbstractC4001c;

/* JADX INFO: loaded from: classes2.dex */
class r extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f37079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f37080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f37081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f37082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f37083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f37084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f37085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f37086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashSet f37088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f37089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f37090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f37092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f37093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f37094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TextView f37095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private EditText f37097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f37098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AbstractC4001c.b f37099u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TextWatcher f37100v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextInputLayout.f f37101w;

    class a extends com.google.android.material.internal.l {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (r.this.f37097s == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f37097s != null) {
                r.this.f37097s.removeTextChangedListener(r.this.f37100v);
                if (r.this.f37097s.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f37097s.setOnFocusChangeListener(null);
                }
            }
            r.this.f37097s = textInputLayout.getEditText();
            if (r.this.f37097s != null) {
                r.this.f37097s.addTextChangedListener(r.this.f37100v);
            }
            r.this.m().n(r.this.f37097s);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f37105a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f37106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f37107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f37108d;

        d(r rVar, h0 h0Var) {
            this.f37106b = rVar;
            this.f37107c = h0Var.n(Y8.k.f17462a7, 0);
            this.f37108d = h0Var.n(Y8.k.f17683y7, 0);
        }

        private s b(int i10) {
            if (i10 == -1) {
                return new C3104g(this.f37106b);
            }
            if (i10 == 0) {
                return new w(this.f37106b);
            }
            if (i10 == 1) {
                return new y(this.f37106b, this.f37108d);
            }
            if (i10 == 2) {
                return new C3103f(this.f37106b);
            }
            if (i10 == 3) {
                return new p(this.f37106b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        s c(int i10) {
            s sVar = (s) this.f37105a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i10);
            this.f37105a.append(i10, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.f37087i = 0;
        this.f37088j = new LinkedHashSet();
        this.f37100v = new a();
        b bVar = new b();
        this.f37101w = bVar;
        this.f37098t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f37079a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f37080b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, Y8.e.f17111P);
        this.f37081c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, Y8.e.f17110O);
        this.f37085g = checkableImageButtonI2;
        this.f37086h = new d(this, h0Var);
        androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(getContext());
        this.f37095q = d10;
        C(h0Var);
        B(h0Var);
        D(h0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(d10);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(h0 h0Var) {
        if (!h0Var.s(Y8.k.f17692z7)) {
            if (h0Var.s(Y8.k.f17502e7)) {
                this.f37089k = p243n9.c.b(getContext(), h0Var, Y8.k.f17502e7);
            }
            if (h0Var.s(Y8.k.f17512f7)) {
                this.f37090l = com.google.android.material.internal.p.h(h0Var.k(Y8.k.f17512f7, -1), null);
            }
        }
        if (h0Var.s(Y8.k.f17482c7)) {
            U(h0Var.k(Y8.k.f17482c7, 0));
            if (h0Var.s(Y8.k.f17452Z6)) {
                Q(h0Var.p(Y8.k.f17452Z6));
            }
            O(h0Var.a(Y8.k.f17443Y6, true));
        } else if (h0Var.s(Y8.k.f17692z7)) {
            if (h0Var.s(Y8.k.f17228A7)) {
                this.f37089k = p243n9.c.b(getContext(), h0Var, Y8.k.f17228A7);
            }
            if (h0Var.s(Y8.k.f17237B7)) {
                this.f37090l = com.google.android.material.internal.p.h(h0Var.k(Y8.k.f17237B7, -1), null);
            }
            U(h0Var.a(Y8.k.f17692z7, false) ? 1 : 0);
            Q(h0Var.p(Y8.k.f17674x7));
        }
        T(h0Var.f(Y8.k.f17472b7, getResources().getDimensionPixelSize(Y8.c.f17058h0)));
        if (h0Var.s(Y8.k.f17492d7)) {
            X(t.b(h0Var.k(Y8.k.f17492d7, -1)));
        }
    }

    private void C(h0 h0Var) {
        if (h0Var.s(Y8.k.f17557k7)) {
            this.f37082d = p243n9.c.b(getContext(), h0Var, Y8.k.f17557k7);
        }
        if (h0Var.s(Y8.k.f17566l7)) {
            this.f37083e = com.google.android.material.internal.p.h(h0Var.k(Y8.k.f17566l7, -1), null);
        }
        if (h0Var.s(Y8.k.f17548j7)) {
            c0(h0Var.g(Y8.k.f17548j7));
        }
        this.f37081c.setContentDescription(getResources().getText(Y8.i.f17175f));
        Z.v0(this.f37081c, 2);
        this.f37081c.setClickable(false);
        this.f37081c.setPressable(false);
        this.f37081c.setFocusable(false);
    }

    private void D(h0 h0Var) {
        this.f37095q.setVisibility(8);
        this.f37095q.setId(Y8.e.f17117V);
        this.f37095q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        Z.o0(this.f37095q, 1);
        q0(h0Var.n(Y8.k.f17372Q7, 0));
        if (h0Var.s(Y8.k.f17381R7)) {
            r0(h0Var.c(Y8.k.f17381R7));
        }
        p0(h0Var.p(Y8.k.f17363P7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        AbstractC4001c.b bVar = this.f37099u;
        if (bVar == null || (accessibilityManager = this.f37098t) == null) {
            return;
        }
        AbstractC4001c.c(accessibilityManager, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f37099u == null || this.f37098t == null || !Z.Q(this)) {
            return;
        }
        AbstractC4001c.a(this.f37098t, this.f37099u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.f37097s == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f37097s.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f37085g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(Y8.g.f17150c, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (p243n9.c.j(getContext())) {
            AbstractC1935v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f37088j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.f37099u = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i10 = this.f37086h.f37107c;
        return i10 == 0 ? sVar.d() : i10;
    }

    private void t0(s sVar) {
        M();
        this.f37099u = null;
        sVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            t.a(this.f37079a, this.f37085g, this.f37089k, this.f37090l);
            return;
        }
        Drawable drawableMutate = p038c1.a.r(n()).mutate();
        p038c1.a.n(drawableMutate, this.f37079a.getErrorCurrentTextColors());
        this.f37085g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f37080b.setVisibility((this.f37085g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f37094p == null || this.f37096r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f37081c.setVisibility(s() != null && this.f37079a.N() && this.f37079a.b0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f37079a.m0();
    }

    private void y0() {
        int visibility = this.f37095q.getVisibility();
        int i10 = (this.f37094p == null || this.f37096r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f37095q.setVisibility(i10);
        this.f37079a.m0();
    }

    boolean A() {
        return this.f37087i != 0;
    }

    boolean E() {
        return A() && this.f37085g.isChecked();
    }

    boolean F() {
        return this.f37080b.getVisibility() == 0 && this.f37085g.getVisibility() == 0;
    }

    boolean G() {
        return this.f37081c.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.f37096r = z10;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f37079a.b0());
        }
    }

    void J() {
        t.d(this.f37079a, this.f37085g, this.f37089k);
    }

    void K() {
        t.d(this.f37079a, this.f37081c, this.f37082d);
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z12 = true;
        if (!sVarM.l() || (zIsChecked = this.f37085g.isChecked()) == sVarM.m()) {
            z11 = false;
        } else {
            this.f37085g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f37085g.isActivated()) == sVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    void N(boolean z10) {
        this.f37085g.setActivated(z10);
    }

    void O(boolean z10) {
        this.f37085g.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f37085g.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? p161j.a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f37085g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f37079a, this.f37085g, this.f37089k, this.f37090l);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f37091m) {
            this.f37091m = i10;
            t.g(this.f37085g, i10);
            t.g(this.f37081c, i10);
        }
    }

    void U(int i10) {
        if (this.f37087i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f37087i;
        this.f37087i = i10;
        j(i11);
        a0(i10 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f37079a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f37079a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f37097s;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f37079a, this.f37085g, this.f37089k, this.f37090l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f37085g, onClickListener, this.f37093o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f37093o = onLongClickListener;
        t.i(this.f37085g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f37092n = scaleType;
        t.j(this.f37085g, scaleType);
        t.j(this.f37081c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f37089k != colorStateList) {
            this.f37089k = colorStateList;
            t.a(this.f37079a, this.f37085g, colorStateList, this.f37090l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f37090l != mode) {
            this.f37090l = mode;
            t.a(this.f37079a, this.f37085g, this.f37089k, mode);
        }
    }

    void a0(boolean z10) {
        if (F() != z10) {
            this.f37085g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f37079a.m0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? p161j.a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f37081c.setImageDrawable(drawable);
        w0();
        t.a(this.f37079a, this.f37081c, this.f37082d, this.f37083e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f37081c, onClickListener, this.f37084f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f37084f = onLongClickListener;
        t.i(this.f37081c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f37082d != colorStateList) {
            this.f37082d = colorStateList;
            t.a(this.f37079a, this.f37081c, colorStateList, this.f37083e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f37083e != mode) {
            this.f37083e = mode;
            t.a(this.f37079a, this.f37081c, this.f37082d, mode);
        }
    }

    void h() {
        this.f37085g.performClick();
        this.f37085g.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f37085g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f37081c;
        }
        if (A() && F()) {
            return this.f37085g;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? p161j.a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f37085g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f37085g.setImageDrawable(drawable);
    }

    s m() {
        return this.f37086h.c(this.f37087i);
    }

    void m0(boolean z10) {
        if (z10 && this.f37087i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f37085g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f37089k = colorStateList;
        t.a(this.f37079a, this.f37085g, colorStateList, this.f37090l);
    }

    int o() {
        return this.f37091m;
    }

    void o0(PorterDuff.Mode mode) {
        this.f37090l = mode;
        t.a(this.f37079a, this.f37085g, this.f37089k, mode);
    }

    int p() {
        return this.f37087i;
    }

    void p0(CharSequence charSequence) {
        this.f37094p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f37095q.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f37092n;
    }

    void q0(int i10) {
        androidx.core.widget.i.o(this.f37095q, i10);
    }

    CheckableImageButton r() {
        return this.f37085g;
    }

    void r0(ColorStateList colorStateList) {
        this.f37095q.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f37081c.getDrawable();
    }

    CharSequence u() {
        return this.f37085g.getContentDescription();
    }

    Drawable v() {
        return this.f37085g.getDrawable();
    }

    CharSequence w() {
        return this.f37094p;
    }

    ColorStateList x() {
        return this.f37095q.getTextColors();
    }

    void x0() {
        if (this.f37079a.f36984d == null) {
            return;
        }
        Z.B0(this.f37095q, getContext().getResources().getDimensionPixelSize(Y8.c.f17031O), this.f37079a.f36984d.getPaddingTop(), (F() || G()) ? 0 : Z.D(this.f37079a.f36984d), this.f37079a.f36984d.getPaddingBottom());
    }

    int y() {
        return Z.D(this) + Z.D(this.f37095q) + ((F() || G()) ? this.f37085g.getMeasuredWidth() + AbstractC1935v.b((ViewGroup.MarginLayoutParams) this.f37085g.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f37095q;
    }
}
