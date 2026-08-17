package p339sf;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f54032a = a.f54034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f54033b = new a.C0666a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f54034a = new a();

        /* JADX INFO: renamed from: sf.n$a$a, reason: collision with other inner class name */
        private static final class C0666a implements n {
            @Override // p339sf.n
            public void c(u url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }

            @Override // p339sf.n
            public List d(u url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.l();
            }
        }

        private a() {
        }
    }

    void c(u uVar, List list);

    List d(u uVar);
}
