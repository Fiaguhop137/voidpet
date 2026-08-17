package p291q3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0614a f51405c = new C0614a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f51407b;

    /* JADX INFO: renamed from: q3.a$a, reason: collision with other inner class name */
    public static final class C0614a {
        private C0614a() {
        }

        public /* synthetic */ C0614a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.q3(i10);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.R2(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.w0(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.w0(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.N2(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.N2(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.N2(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.N2(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.n2(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.N2(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }

    public a(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f51406a = query;
        this.f51407b = objArr;
    }

    @Override // p291q3.j
    public void a(i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f51405c.b(statement, this.f51407b);
    }

    @Override // p291q3.j
    public String b() {
        return this.f51406a;
    }
}
