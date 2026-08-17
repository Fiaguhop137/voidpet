package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f21931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMode f21932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p360u0.a f21933c = new p360u0.a(new a(), null, null, null, null, null, null, 126, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a1 f21934d = a1.Hidden;

    static final class a extends kotlin.jvm.internal.o implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m16invoke() {
            P.this.f21932b = null;
        }
    }

    public P(View view) {
        this.f21931a = view;
    }
}
