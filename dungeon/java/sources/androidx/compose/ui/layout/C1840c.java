package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.layout.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1840c extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21581b = new a(null);

    /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a */
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$a, reason: collision with other inner class name */
        static final class C0261a extends kotlin.jvm.internal.o implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1840c[] f21582a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0261a(C1840c[] c1840cArr) {
                super(2);
                this.f21582a = c1840cArr;
            }

            public final Float a(p.a aVar, float f10) {
                return Float.valueOf(w.b(aVar, true, this.f21582a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((p.a) obj, ((Number) obj2).floatValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$b */
        static final class b extends kotlin.jvm.internal.o implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1840c[] f21583a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C1840c[] c1840cArr) {
                super(2);
                this.f21583a = c1840cArr;
            }

            public final Float a(p.a aVar, float f10) {
                return Float.valueOf(w.b(aVar, false, this.f21583a, f10));
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

        public final C1840c a(C1840c... c1840cArr) {
            return new C1840c(new C0261a(c1840cArr), null);
        }

        public final C1840c b(C1840c... c1840cArr) {
            return new C1840c(new b(c1840cArr), null);
        }
    }

    public C1840c() {
        this(null);
    }

    private C1840c(Function2 function2) {
        super(function2, null);
    }

    public /* synthetic */ C1840c(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @Override // androidx.compose.ui.layout.v
    public float a(float f10, p288q0.m mVar, p288q0.m mVar2) {
        return Float.intBitsToFloat((int) (mVar2.a0(mVar, p019b0.e.e((((long) Float.floatToRawIntBits(((int) (mVar.g() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L))) & 4294967295L));
    }
}
