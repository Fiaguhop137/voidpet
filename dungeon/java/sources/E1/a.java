package E1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f2612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2613b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2614c = 0;

    /* JADX INFO: renamed from: E1.a$a, reason: collision with other inner class name */
    private static class C0053a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f2615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f2616b;

        C0053a(EditText editText, boolean z10) {
            this.f2615a = editText;
            g gVar = new g(editText, z10);
            this.f2616b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(E1.b.getInstance());
        }

        @Override // E1.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // E1.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f2615a, inputConnection, editorInfo);
        }

        @Override // E1.a.b
        void c(boolean z10) {
            this.f2616b.c(z10);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        p199l1.g.h(editText, "editText cannot be null");
        this.f2612a = new C0053a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f2612a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f2612a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f2612a.c(z10);
    }
}
