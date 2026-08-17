package p359u;

/* JADX INFO: renamed from: u.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4226z extends InterfaceC4210i {
    @Override // p359u.InterfaceC4210i
    default w0 a(X x10) {
        return new w0(this);
    }

    default float b(float f10, float f11, float f12) {
        return d(e(f10, f11, f12), f10, f11, f12);
    }

    float c(long j10, float f10, float f11, float f12);

    float d(long j10, float f10, float f11, float f12);

    long e(float f10, float f11, float f12);
}
