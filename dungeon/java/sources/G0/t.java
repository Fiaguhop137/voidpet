package G0;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.O;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f3802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f3803b = Ad.j.a(Ad.m.NONE, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f3804c;

    static final class a extends kotlin.jvm.internal.o implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = t.this.f3802a.getContext().getSystemService("input_method");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public t(View view) {
        this.f3802a = view;
        this.f3804c = new O(view);
    }

    private final InputMethodManager d() {
        return (InputMethodManager) this.f3803b.getValue();
    }

    @Override // G0.s
    public boolean a() {
        return d().isActive(this.f3802a);
    }

    @Override // G0.s
    public void b(CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.f3802a, cursorAnchorInfo);
    }
}
