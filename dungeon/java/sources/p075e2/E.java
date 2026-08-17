package p075e2;

import android.media.MediaDrm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements MediaDrm.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f40232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.b f40233b;

    public /* synthetic */ E(J j10, A.b bVar) {
        this.f40232a = j10;
        this.f40233b = bVar;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        J.o(this.f40232a, this.f40233b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
