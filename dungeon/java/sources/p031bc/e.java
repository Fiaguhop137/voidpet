package p031bc;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JavaScriptTypedArray f26483a;

    public /* synthetic */ e(JavaScriptTypedArray javaScriptTypedArray) {
        this.f26483a = javaScriptTypedArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(JavaScriptTypedArray.p(this.f26483a));
    }
}
