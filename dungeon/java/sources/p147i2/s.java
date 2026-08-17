package p147i2;

import Y1.e;
import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class s extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f43721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43723c;

    public s(Throwable th, t tVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(tVar == null ? null : tVar.f43724a);
        super(sb2.toString(), th);
        this.f43721a = tVar;
        this.f43722b = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.f43723c = a(th);
    }

    private static int a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
