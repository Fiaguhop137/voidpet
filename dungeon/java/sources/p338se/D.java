package p338se;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface D {

    public static final class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53537a = new a();

        private a() {
        }

        @Override // p338se.D
        public List a(String packageFqName) {
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            return CollectionsKt.l();
        }
    }

    List a(String str);
}
