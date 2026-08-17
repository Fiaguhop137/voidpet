package O8;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p170j8.C3849n;

/* JADX INFO: loaded from: classes2.dex */
public final class L {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AbstractC1265n f8471k = AbstractC1265n.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f8474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p352ta.k f8475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Task f8476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Task f8477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f8480i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8481j = new HashMap();

    public L(Context context, p352ta.k kVar, F f10, String str) {
        this.f8472a = context.getPackageName();
        this.f8473b = p352ta.c.a(context);
        this.f8475d = kVar;
        this.f8474c = f10;
        W.a();
        this.f8478g = str;
        this.f8476e = p352ta.g.a().b(new J(this));
        p352ta.g gVarA = p352ta.g.a();
        Objects.requireNonNull(kVar);
        this.f8477f = gVarA.b(new K(kVar));
        AbstractC1265n abstractC1265n = f8471k;
        this.f8479h = abstractC1265n.containsKey(str) ? DynamiteModule.c(context, (String) abstractC1265n.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C3849n.a().b(this.f8478g);
    }
}
