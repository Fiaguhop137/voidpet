package p157ic;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ic.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3600h extends AbstractC3599g {

    /* JADX INFO: renamed from: ic.h$a */
    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43925a = new a();

        a() {
            super(1, p139hc.a.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final p139hc.a invoke(JavaScriptTypedArray p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new p139hc.a(p10);
        }
    }

    public C3600h() {
        super(a.f43925a);
    }
}
