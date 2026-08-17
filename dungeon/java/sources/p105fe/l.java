package p105fe;

import kotlin.jvm.internal.Intrinsics;
import p015ae.i0;
import p123ge.u;
import p284pe.b;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f41891a = new l();

    public static final class a implements p284pe.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f41892b;

        public a(u javaElement) {
            Intrinsics.checkNotNullParameter(javaElement, "javaElement");
            this.f41892b = javaElement;
        }

        @Override // p015ae.h0
        public i0 b() {
            i0 NO_SOURCE_FILE = i0.f19734a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // p284pe.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u c() {
            return this.f41892b;
        }

        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    private l() {
    }

    @Override // p284pe.b
    public p284pe.a a(p302qe.l javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new a((u) javaElement);
    }
}
