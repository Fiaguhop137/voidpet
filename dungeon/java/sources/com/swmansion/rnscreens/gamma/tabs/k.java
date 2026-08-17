package com.swmansion.rnscreens.gamma.tabs;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f39110a;

    public /* synthetic */ k(Function1 function1) {
        this.f39110a = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return m.B(this.f39110a, obj);
    }
}
