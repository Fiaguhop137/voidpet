package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
class y extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f37161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f37162g;

    y(r rVar, int i10) {
        super(rVar);
        this.f37160e = Y8.d.f17085a;
        this.f37162g = new x(this);
        if (i10 != 0) {
            this.f37160e = i10;
        }
    }

    public static /* synthetic */ void v(y yVar, View view) {
        EditText editText = yVar.f37161f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (yVar.w()) {
            yVar.f37161f.setTransformationMethod(null);
        } else {
            yVar.f37161f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            yVar.f37161f.setSelection(selectionEnd);
        }
        yVar.r();
    }

    private boolean w() {
        EditText editText = this.f37161f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return Y8.i.f17168A;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return this.f37160e;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37162g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(EditText editText) {
        this.f37161f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f37161f)) {
            this.f37161f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f37161f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
