package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends Fragment implements InterfaceC2318k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f31843b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f31844a = new m0();

    public static k0 b(Activity activity) {
        k0 k0Var;
        WeakHashMap weakHashMap = f31843b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (k0Var = (k0) weakReference.get()) != null) {
            return k0Var;
        }
        try {
            k0 k0Var2 = (k0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (k0Var2 == null || k0Var2.isRemoving()) {
                k0Var2 = new k0();
                activity.getFragmentManager().beginTransaction().add(k0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(k0Var2));
            return k0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2318k
    public final void a(String str, AbstractC2317j abstractC2317j) {
        this.f31844a.b(str, abstractC2317j);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2318k
    public final AbstractC2317j c(String str, Class cls) {
        return this.f31844a.a(str, cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f31844a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2318k
    public final Activity f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f31844a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31844a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f31844a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f31844a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f31844a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f31844a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f31844a.h();
    }
}
