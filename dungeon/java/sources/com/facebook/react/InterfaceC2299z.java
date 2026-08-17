package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;

/* JADX INFO: renamed from: com.facebook.react.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2299z {
    A6.a b(String str);

    boolean c();

    ReactContext i();

    B6.a j(Context context, String str, Bundle bundle);

    void k(Activity activity, M6.a aVar);

    /* JADX INFO: renamed from: l */
    p456z6.e getDevSupportManager();

    void m(Context context);

    void n(Activity activity);

    void o(Activity activity);

    void onActivityResult(Activity activity, int i10, int i11, Intent intent);

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean z10);

    LifecycleState p();

    void q(Activity activity);

    void r(Activity activity);
}
