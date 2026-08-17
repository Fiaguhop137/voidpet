package p344t2;

import android.view.Surface;
import p147i2.s;
import p147i2.t;

/* JADX INFO: renamed from: t2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4201j extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54237e;

    public C4201j(Throwable th, t tVar, Surface surface) {
        super(th, tVar);
        this.f54236d = System.identityHashCode(surface);
        this.f54237e = surface == null || surface.isValid();
    }
}
