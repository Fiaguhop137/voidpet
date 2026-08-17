package com.facebook.react.uimanager;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f30682a;

    public /* synthetic */ z0(Function2 function2) {
        this.f30682a = function2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return A0.e(this.f30682a, obj, obj2);
    }
}
