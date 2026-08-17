package p453z3;

import android.content.res.AssetFileDescriptor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AssetFileDescriptor f58408a;

    public /* synthetic */ P(AssetFileDescriptor assetFileDescriptor) {
        this.f58408a = assetFileDescriptor;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Q.c(this.f58408a);
    }
}
