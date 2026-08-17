package G2;

import R1.r;
import R1.x;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements x.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final r f3847g = new r.b().y0("application/id3").P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final r f3848h = new r.b().y0("application/x-scte35").P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f3853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3854f;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f3849a = str;
        this.f3850b = str2;
        this.f3851c = j10;
        this.f3852d = j11;
        this.f3853e = bArr;
    }

    @Override // R1.x.a
    public r a() {
        String str = this.f3849a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f3848h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f3847g;
            default:
                return null;
        }
    }

    @Override // R1.x.a
    public byte[] c() {
        if (a() != null) {
            return this.f3853e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f3851c == aVar.f3851c && this.f3852d == aVar.f3852d && Objects.equals(this.f3849a, aVar.f3849a) && Objects.equals(this.f3850b, aVar.f3850b) && Arrays.equals(this.f3853e, aVar.f3853e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f3854f == 0) {
            String str = this.f3849a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f3850b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f3851c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f3852d;
            this.f3854f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f3853e);
        }
        return this.f3854f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f3849a + ", id=" + this.f3852d + ", durationMs=" + this.f3851c + ", value=" + this.f3850b;
    }
}
