package p048cb;

import android.app.Application;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p227mb.b;
import p227mb.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27309a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List f27310b;

    private a() {
    }

    private final List a(Application application) {
        List list = f27310b;
        if (list != null) {
            return list;
        }
        List listA = c.f27311b.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            List listE = ((g) it.next()).e(application);
            Intrinsics.checkNotNullExpressionValue(listE, "createApplicationLifecycleListeners(...)");
            CollectionsKt.B(arrayList, listE);
        }
        f27310b = arrayList;
        return arrayList;
    }

    public static final void b(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Iterator it = f27309a.a(application).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(application);
        }
    }

    public static final void c(Application application, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Iterator it = f27309a.a(application).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onConfigurationChanged(newConfig);
        }
    }
}
