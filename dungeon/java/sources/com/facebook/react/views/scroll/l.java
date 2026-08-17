package com.facebook.react.views.scroll;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f30912a;

    public /* synthetic */ l(Function1 function1) {
        this.f30912a = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return o.D(this.f30912a, obj);
    }
}
