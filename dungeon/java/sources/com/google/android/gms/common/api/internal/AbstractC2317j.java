package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2317j {

    @NonNull
    protected final InterfaceC2318k mLifecycleFragment;

    protected AbstractC2317j(InterfaceC2318k interfaceC2318k) {
        this.mLifecycleFragment = interfaceC2318k;
    }

    @NonNull
    public static InterfaceC2318k getFragment(@NonNull Activity activity) {
        return getFragment(new C2316i(activity));
    }

    @NonNull
    public static InterfaceC2318k getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    protected static InterfaceC2318k getFragment(@NonNull C2316i c2316i) {
        if (c2316i.a()) {
            return n0.V1(c2316i.d());
        }
        if (c2316i.b()) {
            return k0.b(c2316i.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
    }

    @NonNull
    public Activity getActivity() {
        Activity activityF = this.mLifecycleFragment.f();
        p170j8.r.l(activityF);
        return activityF;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
