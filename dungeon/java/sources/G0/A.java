package G0;

import C0.N0;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f3712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private G f3715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f3718g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3719h = true;

    public A(G g10, r rVar, boolean z10) {
        this.f3712a = rVar;
        this.f3713b = z10;
        this.f3715d = g10;
    }

    private final void a(n nVar) {
        b();
        try {
            this.f3718g.add(nVar);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.f3714c++;
        return true;
    }

    private final boolean c() {
        int i10 = this.f3714c - 1;
        this.f3714c = i10;
        if (i10 == 0 && !this.f3718g.isEmpty()) {
            this.f3712a.e(CollectionsKt.W0(this.f3718g));
            this.f3718g.clear();
        }
        return this.f3714c > 0;
    }

    private final void d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f3719h;
        return z10 ? b() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f3719h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f3718g.clear();
        this.f3714c = 0;
        this.f3719h = false;
        this.f3712a.b(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f3719h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f3719h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f3719h;
        return z10 ? this.f3713b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f3719h;
        if (z10) {
            a(new C1005a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f3719h;
        if (!z10) {
            return z10;
        }
        a(new C1016l(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f3719h;
        if (!z10) {
            return z10;
        }
        a(new C1017m(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f3719h;
        if (!z10) {
            return z10;
        }
        a(new o());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f3715d.h(), N0.j(this.f3715d.g()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f3717f = z10;
        if (z10) {
            this.f3716e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return u.a(this.f3715d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (N0.f(this.f3715d.g())) {
            return null;
        }
        return H.a(this.f3715d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return H.b(this.f3715d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return H.c(this.f3715d, i10).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f3719h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    a(new D(0, this.f3715d.h().length()));
                    break;
                case 16908320:
                    d(277);
                    break;
                case 16908321:
                    d(278);
                    break;
                case 16908322:
                    d(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f3719h;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = p.f3783b.c();
                    break;
                case 3:
                    iA = p.f3783b.g();
                    break;
                case 4:
                    iA = p.f3783b.h();
                    break;
                case 5:
                    iA = p.f3783b.d();
                    break;
                case 6:
                    iA = p.f3783b.b();
                    break;
                case 7:
                    iA = p.f3783b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iA = p.f3783b.a();
                    break;
            }
        } else {
            iA = p.f3783b.a();
        }
        this.f3712a.d(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f3719h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f3719h;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.f3712a.c(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f3719h;
        if (!z10) {
            return z10;
        }
        this.f3712a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f3719h;
        if (z10) {
            a(new B(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f3719h;
        if (z10) {
            a(new C(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f3719h;
        if (!z10) {
            return z10;
        }
        a(new D(i10, i11));
        return true;
    }
}
