package Y3;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {
    public c(List list) {
        super(b(list));
    }

    private static p095f4.a a(p095f4.a aVar) {
        Z3.d dVar = (Z3.d) aVar.f41713b;
        Z3.d dVar2 = (Z3.d) aVar.f41714c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrC = c(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrC), dVar2.b(fArrC));
    }

    private static List b(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, a((p095f4.a) list.get(i10)));
        }
        return list;
    }

    static float[] c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // Y3.p, Y3.o
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // Y3.o
    public U3.a k() {
        return new U3.e(this.f16935a);
    }

    @Override // Y3.p, Y3.o
    public /* bridge */ /* synthetic */ List l() {
        return super.l();
    }

    @Override // Y3.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
