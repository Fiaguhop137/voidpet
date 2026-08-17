package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1825m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f21065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E1.a f21066b;

    C1825m(EditText editText) {
        this.f21065a = editText;
        this.f21066b = new E1.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f21066b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f21065a.getContext().obtainStyledAttributes(attributeSet, p144i.j.f43400g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(p144i.j.f43470u0) ? typedArrayObtainStyledAttributes.getBoolean(p144i.j.f43470u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f21066b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f21066b.c(z10);
    }
}
