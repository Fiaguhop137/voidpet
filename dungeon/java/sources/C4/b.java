package C4;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p220m4.a.InterfaceC0582a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p328s4.d f1383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p328s4.b f1384b;

    public b(p328s4.d dVar, p328s4.b bVar) {
        this.f1383a = dVar;
        this.f1384b = bVar;
    }

    @Override // p220m4.a.InterfaceC0582a
    public void a(Bitmap bitmap) {
        this.f1383a.c(bitmap);
    }

    @Override // p220m4.a.InterfaceC0582a
    public byte[] b(int i10) {
        p328s4.b bVar = this.f1384b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // p220m4.a.InterfaceC0582a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f1383a.e(i10, i11, config);
    }

    @Override // p220m4.a.InterfaceC0582a
    public int[] d(int i10) {
        p328s4.b bVar = this.f1384b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // p220m4.a.InterfaceC0582a
    public void e(byte[] bArr) {
        p328s4.b bVar = this.f1384b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // p220m4.a.InterfaceC0582a
    public void f(int[] iArr) {
        p328s4.b bVar = this.f1384b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
