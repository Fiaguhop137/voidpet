package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.C2341j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i0 extends AbstractC2317j implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile boolean f31839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReference f31840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f31841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final C2341j f31842d;

    i0(InterfaceC2318k interfaceC2318k, C2341j c2341j) {
        super(interfaceC2318k);
        this.f31840b = new AtomicReference(null);
        this.f31841c = new I8.h(Looper.getMainLooper());
        this.f31842d = c2341j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C2333b c2333b, int i10) {
        this.f31840b.set(null);
        b(c2333b, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.f31840b.set(null);
        c();
    }

    private static final int e(f0 f0Var) {
        if (f0Var == null) {
            return -1;
        }
        return f0Var.a();
    }

    protected abstract void b(C2333b c2333b, int i10);

    protected abstract void c();

    public final void h(C2333b c2333b, int i10) {
        AtomicReference atomicReference;
        f0 f0Var = new f0(c2333b, i10);
        do {
            atomicReference = this.f31840b;
            if (p359u.G.a(atomicReference, null, f0Var)) {
                this.f31841c.post(new h0(this, f0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2317j
    public final void onActivityResult(int i10, int i11, Intent intent) {
        f0 f0Var = (f0) this.f31840b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f31842d.g(getActivity());
                if (iG == 0) {
                    d();
                    return;
                } else {
                    if (f0Var == null) {
                        return;
                    }
                    if (f0Var.b().b4() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (f0Var != null) {
                a(new C2333b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, f0Var.b().toString()), e(f0Var));
                return;
            }
            return;
        }
        if (f0Var != null) {
            a(f0Var.b(), f0Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new C2333b(13, null), e((f0) this.f31840b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2317j
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f31840b.set(bundle.getBoolean("resolving_error", false) ? new f0(new C2333b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2317j
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f0 f0Var = (f0) this.f31840b.get();
        if (f0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", f0Var.a());
        bundle.putInt("failed_status", f0Var.b().b4());
        bundle.putParcelable("failed_resolution", f0Var.b().d4());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2317j
    public void onStart() {
        super.onStart();
        this.f31839a = true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2317j
    public void onStop() {
        super.onStop();
        this.f31839a = false;
    }
}
