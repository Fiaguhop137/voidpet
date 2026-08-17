package E1;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.f.AbstractC0290f f2635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2636d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2637e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2638f = true;

    static class a extends androidx.emoji2.text.f.AbstractC0290f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f2639a;

        a(EditText editText) {
            this.f2639a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0290f
        public void b() {
            Handler handler;
            super.b();
            EditText editText = (EditText) this.f2639a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g.b((EditText) this.f2639a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f2633a = editText;
        this.f2634b = z10;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f2638f) {
            return (this.f2634b || androidx.emoji2.text.f.i()) ? false : true;
        }
        return true;
    }

    androidx.emoji2.text.f.AbstractC0290f a() {
        if (this.f2635c == null) {
            this.f2635c = new a(this.f2633a);
        }
        return this.f2635c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f2638f != z10) {
            if (this.f2635c != null) {
                androidx.emoji2.text.f.c().u(this.f2635c);
            }
            this.f2638f = z10;
            if (z10) {
                b(this.f2633a, androidx.emoji2.text.f.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f2633a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.f.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.f.c().s((Spannable) charSequence, i10, i10 + i12, this.f2636d, this.f2637e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().t(a());
    }
}
