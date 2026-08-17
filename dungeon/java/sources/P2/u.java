package P2;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O.a f8774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f8776e;

    public u(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        AbstractC1459a.a((bArr2 == null) ^ (i10 == 0));
        this.f8772a = z10;
        this.f8773b = str;
        this.f8775d = i10;
        this.f8776e = bArr2;
        this.f8774c = new O.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                AbstractC1477t.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
