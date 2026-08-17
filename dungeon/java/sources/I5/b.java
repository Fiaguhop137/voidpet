package I5;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0103a f4924n = new C0103a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f4925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f4926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map f4927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map f4928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f4929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f4930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Uri f4931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4932h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4933i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f4934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Float f4935k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Float f4936l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f4937m;

        /* JADX INFO: renamed from: I5.b$a$a, reason: collision with other inner class name */
        public static final class C0103a {
            private C0103a() {
            }

            public /* synthetic */ C0103a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    void a(String str, Object obj);

    void b(String str, Object obj, a aVar);

    void c(String str, Object obj, a aVar);

    void d(String str, Throwable th, a aVar);

    void e(String str);

    void g(String str, a aVar);
}
