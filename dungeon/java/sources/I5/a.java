package I5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0102a f4922a = new C0102a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f4923b = new a();

    /* JADX INFO: renamed from: I5.a$a, reason: collision with other inner class name */
    public static final class C0102a {
        private C0102a() {
        }

        public /* synthetic */ C0102a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // I5.b
    public void a(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // I5.b
    public void b(String id2, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // I5.b
    public void c(String id2, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // I5.b
    public void d(String id2, Throwable th, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // I5.b
    public void e(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // I5.b
    public void g(String id2, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }
}
