package p157ic;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import p139hc.h;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC3599g {

    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43873a = new a();

        a() {
            super(1, h.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final h invoke(JavaScriptTypedArray p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new h(p10);
        }
    }

    public L() {
        super(a.f43873a);
    }
}
