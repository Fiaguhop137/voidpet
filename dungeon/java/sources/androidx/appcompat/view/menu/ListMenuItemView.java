package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.h0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f20248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f20249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f20250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f20251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f20252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f20253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f20254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f20255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f20256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f20257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f20259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f20261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayoutInflater f20263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20264q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43061B);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        h0 h0VarV = h0.v(getContext(), attributeSet, p144i.j.f43343T1, i10, 0);
        this.f20257j = h0VarV.g(p144i.j.f43351V1);
        this.f20258k = h0VarV.n(p144i.j.f43347U1, -1);
        this.f20260m = h0VarV.a(p144i.j.f43355W1, false);
        this.f20259l = context;
        this.f20261n = h0VarV.g(p144i.j.f43359X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, p144i.a.f43097y, 0);
        this.f20262o = typedArrayObtainStyledAttributes.hasValue(0);
        h0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f20256i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(p144i.g.f43216h, (ViewGroup) this, false);
        this.f20252e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(p144i.g.f43217i, (ViewGroup) this, false);
        this.f20249b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(p144i.g.f43219k, (ViewGroup) this, false);
        this.f20250c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f20263p == null) {
            this.f20263p = LayoutInflater.from(getContext());
        }
        return this.f20263p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f20254g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f20255h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20255h.getLayoutParams();
        rect.top += this.f20255h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f20248a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f20248a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f20248a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f20253f.setText(this.f20248a.h());
        }
        if (this.f20253f.getVisibility() != i10) {
            this.f20253f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f20257j);
        TextView textView = (TextView) findViewById(p144i.f.f43179N);
        this.f20251d = textView;
        int i10 = this.f20258k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f20259l, i10);
        }
        this.f20253f = (TextView) findViewById(p144i.f.f43172G);
        ImageView imageView = (ImageView) findViewById(p144i.f.f43175J);
        this.f20254g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f20261n);
        }
        this.f20255h = (ImageView) findViewById(p144i.f.f43201s);
        this.f20256i = (LinearLayout) findViewById(p144i.f.f43195m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f20249b != null && this.f20260m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f20249b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f20250c == null && this.f20252e == null) {
            return;
        }
        if (this.f20248a.m()) {
            if (this.f20250c == null) {
                g();
            }
            compoundButton = this.f20250c;
            view = this.f20252e;
        } else {
            if (this.f20252e == null) {
                e();
            }
            compoundButton = this.f20252e;
            view = this.f20250c;
        }
        if (z10) {
            compoundButton.setChecked(this.f20248a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f20252e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f20250c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f20248a.m()) {
            if (this.f20250c == null) {
                g();
            }
            compoundButton = this.f20250c;
        } else {
            if (this.f20252e == null) {
                e();
            }
            compoundButton = this.f20252e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f20264q = z10;
        this.f20260m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f20255h;
        if (imageView != null) {
            imageView.setVisibility((this.f20262o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f20248a.z() || this.f20264q;
        if (z10 || this.f20260m) {
            ImageView imageView = this.f20249b;
            if (imageView == null && drawable == null && !this.f20260m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f20260m) {
                this.f20249b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f20249b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f20249b.getVisibility() != 0) {
                this.f20249b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f20251d.getVisibility() != 8) {
                this.f20251d.setVisibility(8);
            }
        } else {
            this.f20251d.setText(charSequence);
            if (this.f20251d.getVisibility() != 0) {
                this.f20251d.setVisibility(0);
            }
        }
    }
}
