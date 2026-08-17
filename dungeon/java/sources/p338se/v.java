package p338se;

import Ne.A;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p302qe.g;
import p410we.c;
import p464ze.b;

/* JADX INFO: loaded from: classes3.dex */
public interface v extends A {

    public static abstract class a {

        /* JADX INFO: renamed from: se.v$a$a, reason: collision with other inner class name */
        public static final class C0660a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final x f53648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final byte[] f53649b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0660a(x kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f53648a = kotlinJvmBinaryClass;
                this.f53649b = bArr;
            }

            public /* synthetic */ C0660a(x xVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(xVar, (i10 & 2) != 0 ? null : bArr);
            }

            public final x b() {
                return this.f53648a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            C0660a c0660a = this instanceof C0660a ? (C0660a) this : null;
            if (c0660a != null) {
                return c0660a.b();
            }
            return null;
        }
    }

    a b(b bVar, c cVar);

    a c(g gVar, c cVar);
}
