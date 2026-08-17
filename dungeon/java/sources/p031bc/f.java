package p031bc;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JavaScriptTypedArray f26484a;

    public /* synthetic */ f(JavaScriptTypedArray javaScriptTypedArray) {
        this.f26484a = javaScriptTypedArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(JavaScriptTypedArray.m(this.f26484a));
    }
}
