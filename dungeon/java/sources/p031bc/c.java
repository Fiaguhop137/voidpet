package p031bc;

import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JavaScriptObject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements JNIFunctionBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f26481a;

    public /* synthetic */ c(Function0 function0) {
        this.f26481a = function0;
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public final Object invoke(Object[] objArr) {
        return JavaScriptObject.d(this.f26481a, objArr);
    }
}
