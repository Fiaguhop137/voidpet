package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SpannableStringBuilder f31251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f31252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CharSequence f31257g;

    public p(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f31251a = new SpannableStringBuilder(editText.getText());
        this.f31252b = editText.getTextSize();
        this.f31253c = editText.getMinLines();
        this.f31254d = editText.getMaxLines();
        this.f31255e = editText.getInputType();
        this.f31256f = editText.getBreakStrategy();
        this.f31257g = editText.getHint();
    }

    public final void a(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.setText(this.f31251a);
        editText.setTextSize(0, this.f31252b);
        editText.setMinLines(this.f31253c);
        editText.setMaxLines(this.f31254d);
        editText.setInputType(this.f31255e);
        editText.setHint(this.f31257g);
        editText.setBreakStrategy(this.f31256f);
    }
}
