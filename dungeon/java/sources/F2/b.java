package F2;

import E2.c;
import R1.x;
import U1.E;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    private static x c(E e10) {
        e10.r(12);
        int iD = (e10.d() + e10.h(12)) - 4;
        e10.r(44);
        e10.s(e10.h(12));
        e10.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (e10.d() >= iD) {
                break;
            }
            e10.r(48);
            int iH = e10.h(8);
            e10.r(4);
            int iD2 = e10.d() + e10.h(12);
            String strL2 = null;
            while (e10.d() < iD2) {
                int iH2 = e10.h(8);
                int iH3 = e10.h(8);
                int iD3 = e10.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = e10.h(16);
                    e10.r(8);
                    if (iH4 == 3) {
                        while (e10.d() < iD3) {
                            strL = e10.l(e10.h(8), StandardCharsets.US_ASCII);
                            int iH5 = e10.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                e10.s(e10.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = e10.l(iH3, StandardCharsets.US_ASCII);
                }
                e10.p(iD3 * 8);
            }
            e10.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x(arrayList);
    }

    @Override // E2.c
    protected x b(E2.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new E(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
