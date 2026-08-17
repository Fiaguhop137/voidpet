package p436y4;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import p274p4.h;
import p274p4.j;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class x implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f57947a;

    public x(p pVar) {
        this.f57947a = pVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, h hVar) {
        return this.f57947a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, h hVar) {
        return e(parcelFileDescriptor) && this.f57947a.o(parcelFileDescriptor);
    }
}
