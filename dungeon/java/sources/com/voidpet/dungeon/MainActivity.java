package com.voidpet.dungeon;

import Zc.d;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.AbstractActivityC2237q;
import com.facebook.react.C2240u;
import com.facebook.react.defaults.b;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p048cb.m;
import p350t8.f;
import p350t8.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0011"}, d2 = {"Lcom/voidpet/dungeon/MainActivity;", "Lcom/facebook/react/q;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onUserLeaveHint", "", "F0", "()Ljava/lang/String;", "Lcom/facebook/react/u;", "C0", "()Lcom/facebook/react/u;", "b", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainActivity extends AbstractActivityC2237q {

    public static final class a extends b {
        a(MainActivity mainActivity, String str, boolean z10) {
            super(mainActivity, str, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(f fVar, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful() && task.getResult() != null && ((p350t8.b) task.getResult()).a()) {
            return;
        }
        fVar.b();
    }

    @Override // com.facebook.react.AbstractActivityC2237q
    protected C2240u C0() {
        return new m(this, false, new a(this, F0(), com.facebook.react.defaults.a.a()));
    }

    protected String F0() {
        return "main";
    }

    @Override // com.facebook.react.AbstractActivityC2237q, M6.a
    public void b() {
        if (Build.VERSION.SDK_INT > 30) {
            super.b();
        } else {
            if (moveTaskToBack(false)) {
                return;
            }
            super.b();
        }
    }

    @Override // com.facebook.react.AbstractActivityC2237q, androidx.fragment.app.j, p054d.j, Y0.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        d.f18921a.k(this);
        super.onCreate(null);
        f fVarB = h.b(this);
        Intrinsics.checkNotNullExpressionValue(fVarB, "getGamesSignInClient(...)");
        fVarB.a().addOnCompleteListener(new Va.a(fVarB));
    }

    @Override // com.facebook.react.AbstractActivityC2237q, p054d.j, android.app.Activity
    public void onUserLeaveHint() {
        try {
            super.onUserLeaveHint();
        } catch (NullPointerException unused) {
        }
    }
}
