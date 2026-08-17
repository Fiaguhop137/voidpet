package p311r5;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.Intrinsics;
import p275p5.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f52394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f52395c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f52396d = -1;

    public a(b bVar) {
        this.f52394b = bVar;
    }

    @Override // p275p5.c, p275p5.d
    public void l(String id2, Object obj, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f52396d = jCurrentTimeMillis;
        b bVar = this.f52394b;
        if (bVar != null) {
            bVar.a(jCurrentTimeMillis - this.f52395c);
        }
    }

    @Override // p275p5.c, p275p5.d
    public void q(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f52395c = System.currentTimeMillis();
    }
}
