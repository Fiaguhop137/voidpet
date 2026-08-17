package p031bc;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JavaScriptTypedArray f26485a;

    public /* synthetic */ g(JavaScriptTypedArray javaScriptTypedArray) {
        this.f26485a = javaScriptTypedArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(JavaScriptTypedArray.n(this.f26485a));
    }
}
