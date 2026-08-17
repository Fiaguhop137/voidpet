package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SearchView f39209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f39210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f39211c;

    public n0(SearchView searchView) {
        Intrinsics.checkNotNullParameter(searchView, "searchView");
        this.f39209a = searchView;
    }

    private final ImageView a() {
        return (ImageView) this.f39209a.findViewById(p144i.f.f43208z);
    }

    private final EditText b() {
        View viewFindViewById = this.f39209a.findViewById(p144i.f.f43170E);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    private final ImageView c() {
        return (ImageView) this.f39209a.findViewById(p144i.f.f43207y);
    }

    private final View d() {
        return this.f39209a.findViewById(p144i.f.f43169D);
    }

    public final void e(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            c().setColorFilter(iIntValue);
            a().setColorFilter(iIntValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            EditText editTextB = b();
            if (editTextB != null) {
                editTextB.setHintTextColor(iIntValue);
            }
        }
    }

    public final void g(String placeholder, boolean z10) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        if (z10) {
            this.f39209a.setQueryHint(placeholder);
            return;
        }
        EditText editTextB = b();
        if (editTextB != null) {
            editTextB.setHint(placeholder);
        }
    }

    public final void h(Integer num) {
        EditText editTextB;
        ColorStateList textColors;
        Integer num2 = this.f39210b;
        if (num == null) {
            if (num2 == null || (editTextB = b()) == null) {
                return;
            }
            editTextB.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText editTextB2 = b();
            this.f39210b = (editTextB2 == null || (textColors = editTextB2.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText editTextB3 = b();
        if (editTextB3 != null) {
            editTextB3.setTextColor(num.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f39211c;
        if (num != null) {
            if (drawable == null) {
                this.f39211c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
