package p157ic;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import p139hc.b;

/* JADX INFO: renamed from: ic.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3601i extends AbstractC3599g {

    /* JADX INFO: renamed from: ic.i$a */
    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43927a = new a();

        a() {
            super(1, b.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final b invoke(JavaScriptTypedArray p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new b(p10);
        }
    }

    public C3601i() {
        super(a.f43927a);
    }
}
