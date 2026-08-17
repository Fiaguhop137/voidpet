package Rc;

import android.content.Context;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Sc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f10987b;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10986a = context;
        this.f10987b = new i(context);
    }

    @Override // Sc.a
    public Ic.c a(Ic.c category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return this.f10987b.e(category);
    }

    @Override // Sc.a
    public boolean b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return this.f10987b.d(identifier);
    }

    @Override // Sc.a
    public Collection c() {
        return this.f10987b.a();
    }
}
