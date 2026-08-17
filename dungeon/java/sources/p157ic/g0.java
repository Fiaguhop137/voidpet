package p157ic;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import p139hc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends AbstractC3599g {

    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43924a = new a();

        a() {
            super(1, l.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final l invoke(JavaScriptTypedArray p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new l(p10);
        }
    }

    public g0() {
        super(a.f43924a);
    }
}
