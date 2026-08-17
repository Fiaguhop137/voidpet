package p453z3;

import If.AbstractC1113o;
import K3.o;
import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static final ImageDecoder.Source b(v vVar, o oVar, boolean z10) {
        If.Q qD3;
        if (vVar.getFileSystem() == AbstractC1113o.f5547b && (qD3 = vVar.D3()) != null) {
            return ImageDecoder.createSource(qD3.toFile());
        }
        v.a metadata = vVar.getMetadata();
        if (metadata instanceof C4369a) {
            return ImageDecoder.createSource(oVar.c().getAssets(), ((C4369a) metadata).a());
        }
        if ((metadata instanceof C4376h) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptorA = ((C4376h) metadata).a();
                Os.lseek(assetFileDescriptorA.getFileDescriptor(), assetFileDescriptorA.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new P(assetFileDescriptorA));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof x) {
            x xVar = (x) metadata;
            if (Intrinsics.b(xVar.a(), oVar.c().getPackageName())) {
                return ImageDecoder.createSource(oVar.c().getResources(), xVar.b());
            }
        }
        if (!(metadata instanceof C4375g)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z10 || ((C4375g) metadata).a().isDirect()) {
            return ImageDecoder.createSource(((C4375g) metadata).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetFileDescriptor c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
