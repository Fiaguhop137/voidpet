package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24280c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private M1.b f24282b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new G();
            }
            ClassLoader classLoader = G.class.getClassLoader();
            Intrinsics.c(classLoader);
            bundle.setClassLoader(classLoader);
            return new G(p237n3.c.g(p237n3.c.a(bundle)));
        }
    }

    public G() {
        this.f24281a = new LinkedHashMap();
        this.f24282b = new M1.b(null, 1, null);
    }

    public G(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f24281a = new LinkedHashMap();
        this.f24282b = new M1.b(initialState);
    }

    public final n3.f.b a() {
        return this.f24282b.b();
    }
}
