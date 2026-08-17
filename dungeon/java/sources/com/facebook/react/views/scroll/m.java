package com.facebook.react.views.scroll;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.f f30913a;

    public /* synthetic */ m(o.f fVar) {
        this.f30913a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(o.z(this.f30913a, (WeakReference) obj));
    }
}
