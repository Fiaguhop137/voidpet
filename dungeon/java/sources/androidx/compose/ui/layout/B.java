package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class B extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21547b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.B$a$a, reason: collision with other inner class name */
        static final class C0260a extends kotlin.jvm.internal.o implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ B[] f21548a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0260a(B[] bArr) {
                super(2);
                this.f21548a = bArr;
            }

            public final Float a(p.a aVar, float f10) {
                return Float.valueOf(w.b(aVar, true, this.f21548a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((p.a) obj, ((Number) obj2).floatValue());
            }
        }

        static final class b extends kotlin.jvm.internal.o implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ B[] f21549a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(B[] bArr) {
                super(2);
                this.f21549a = bArr;
            }

            public final Float a(p.a aVar, float f10) {
                return Float.valueOf(w.b(aVar, false, this.f21549a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((p.a) obj, ((Number) obj2).floatValue());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B a(Function2 function2) {
            return new B(function2, null);
        }

        public final B b(B... bArr) {
            return a(new C0260a(bArr));
        }

        public final B c(B... bArr) {
            return a(new b(bArr));
        }
    }

    public B() {
        this(null);
    }

    private B(Function2 function2) {
        super(function2, null);
    }

    public /* synthetic */ B(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @Override // androidx.compose.ui.layout.v
    public float a(float f10, p288q0.m mVar, p288q0.m mVar2) {
        return Float.intBitsToFloat((int) (mVar2.a0(mVar, p019b0.e.e((((long) Float.floatToRawIntBits(((int) (mVar.g() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32))) >> 32));
    }
}
