package Y1;

import U1.AbstractC1459a;
import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f16797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f16798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f16800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f16805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f16806j;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f16807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f16808b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f16807a = cryptoInfo;
            this.f16808b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* synthetic */ b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this(cryptoInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f16808b.set(i10, i11);
            this.f16807a.setPattern(this.f16808b);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f16805i = cryptoInfo;
        this.f16806j = new b(cryptoInfo, null);
    }

    public MediaCodec.CryptoInfo a() {
        return this.f16805i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f16800d == null) {
            int[] iArr = new int[1];
            this.f16800d = iArr;
            this.f16805i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f16800d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f16802f = i10;
        this.f16800d = iArr;
        this.f16801e = iArr2;
        this.f16798b = bArr;
        this.f16797a = bArr2;
        this.f16799c = i11;
        this.f16803g = i12;
        this.f16804h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f16805i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        ((b) AbstractC1459a.e(this.f16806j)).b(i12, i13);
    }
}
