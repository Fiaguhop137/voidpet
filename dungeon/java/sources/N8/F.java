package N8;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import p170j8.C3849n;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AbstractC1213h f7989i = AbstractC1213h.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f7992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p352ta.k f7993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Task f7994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Task f7995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7997h;

    public F(Context context, p352ta.k kVar, y yVar, String str) {
        new HashMap();
        new HashMap();
        this.f7990a = context.getPackageName();
        this.f7991b = p352ta.c.a(context);
        this.f7993d = kVar;
        this.f7992c = yVar;
        O.a();
        this.f7996g = str;
        this.f7994e = p352ta.g.a().b(new D(this));
        p352ta.g gVarA = p352ta.g.a();
        Objects.requireNonNull(kVar);
        this.f7995f = gVarA.b(new E(kVar));
        AbstractC1213h abstractC1213h = f7989i;
        this.f7997h = abstractC1213h.containsKey(str) ? DynamiteModule.c(context, (String) abstractC1213h.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C3849n.a().b(this.f7996g);
    }
}
