package R3;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: R3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1368o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f10844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10845c;

    public /* synthetic */ CallableC1368o(Context context, ZipInputStream zipInputStream, String str) {
        this.f10843a = context;
        this.f10844b = zipInputStream;
        this.f10845c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC1373u.F(this.f10843a, this.f10844b, this.f10845c);
    }
}
