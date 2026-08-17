package I5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class d extends I5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4938d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4939c = new ArrayList(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // I5.a, I5.b
    public void a(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f4939c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f4939c.get(i10)).a(id2, obj);
                    Unit unit = Unit.f48228a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // I5.a, I5.b
    public void b(String id2, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f4939c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f4939c.get(i10)).b(id2, obj, aVar);
                    Unit unit = Unit.f48228a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // I5.a, I5.b
    public void c(String id2, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f4939c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f4939c.get(i10)).c(id2, obj, aVar);
                    Unit unit = Unit.f48228a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // I5.a, I5.b
    public void d(String id2, Throwable th, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f4939c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f4939c.get(i10)).d(id2, th, aVar);
                    Unit unit = Unit.f48228a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // I5.a, I5.b
    public void e(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f4939c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f4939c.get(i10)).e(id2);
                    Unit unit = Unit.f48228a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // I5.a, I5.b
    public void g(String id2, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f4939c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f4939c.get(i10)).g(id2, aVar);
                    Unit unit = Unit.f48228a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void h(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f4939c.add(listener);
    }

    public final synchronized void i(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f4939c.remove(listener);
    }
}
