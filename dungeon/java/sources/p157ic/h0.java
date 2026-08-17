package p157ic;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import p139hc.m;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends AbstractC3599g {

    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43926a = new a();

        a() {
            super(1, m.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final m invoke(JavaScriptTypedArray p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new m(p10);
        }
    }

    public h0() {
        super(a.f43926a);
    }
}
