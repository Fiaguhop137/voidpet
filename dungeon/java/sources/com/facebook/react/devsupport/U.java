package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f29631b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29632a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(U u10) {
        u10.f29632a = false;
    }

    public final boolean b(int i10, View view) {
        if (i10 == 46 && !(view instanceof EditText)) {
            if (this.f29632a) {
                this.f29632a = false;
                return true;
            }
            this.f29632a = true;
            new Handler(Looper.getMainLooper()).postDelayed(new T(this), 200L);
        }
        return false;
    }
}
