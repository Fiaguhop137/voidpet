package androidx.media;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f24416a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24417b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f24418c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f24419d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f24417b;
    }

    public int b() {
        int i10 = this.f24418c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f24419d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f24418c, this.f24416a);
    }

    public int d() {
        return this.f24416a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f24417b == audioAttributesImplBase.a() && this.f24418c == audioAttributesImplBase.b() && this.f24416a == audioAttributesImplBase.d() && this.f24419d == audioAttributesImplBase.f24419d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24417b), Integer.valueOf(this.f24418c), Integer.valueOf(this.f24416a), Integer.valueOf(this.f24419d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f24419d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f24419d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f24416a));
        sb2.append(" content=");
        sb2.append(this.f24417b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f24418c).toUpperCase());
        return sb2.toString();
    }
}
