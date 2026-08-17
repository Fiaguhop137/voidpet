package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import p217m1.AbstractC4001c;

/* JADX INFO: loaded from: classes2.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f37109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f37110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f37111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f37112d;

    s(r rVar) {
        this.f37109a = rVar.f37079a;
        this.f37110b = rVar;
        this.f37111c = rVar.getContext();
        this.f37112d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AbstractC4001c.b h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, p217m1.B b10) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z10) {
    }

    final void r() {
        this.f37110b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
