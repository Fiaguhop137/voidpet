package R;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f9863a = e(new j(), new k());

    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f9864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f9865b;

        a(Function2 function2, Function1 function1) {
            this.f9864a = function2;
            this.f9865b = function1;
        }

        @Override // R.i
        public Object a(Object obj) {
            return this.f9865b.invoke(obj);
        }

        @Override // R.i
        public Object b(m mVar, Object obj) {
            return this.f9864a.invoke(mVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(m mVar, Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    public static final i e(Function2 function2, Function1 function1) {
        return new a(function2, function1);
    }

    public static final i f() {
        i iVar = f9863a;
        Intrinsics.d(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return iVar;
    }
}
