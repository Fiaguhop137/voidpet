package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2275s extends JSApplicationCausedNativeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f30547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2275s(String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2275s(String msg, View view, Throwable cause) {
        super(msg, cause);
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f30547a = view;
    }
}
