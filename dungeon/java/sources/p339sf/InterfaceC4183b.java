package p339sf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4183b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53800a = a.f53803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC4183b f53801b = new a.C0663a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC4183b f53802c = new p393vf.a(null, 1, null);

    /* JADX INFO: renamed from: sf.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f53803a = new a();

        /* JADX INFO: renamed from: sf.b$a$a, reason: collision with other inner class name */
        private static final class C0663a implements InterfaceC4183b {
            @Override // p339sf.InterfaceC4183b
            public C a(G g10, E response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }

        private a() {
        }
    }

    C a(G g10, E e10);
}
