package A;

import java.util.List;
import p288q0.InterfaceC4062i;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f105a = new y();

    private y() {
    }

    public final int a(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i12);
            float fE = G.e(G.d(interfaceC4062i));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC4062i.c0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC4062i.A(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC4062i interfaceC4062i2 = (InterfaceC4062i) list.get(i13);
            float fE2 = G.e(G.d(interfaceC4062i2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC4062i2.A(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i13);
            float fE = G.e(G.d(interfaceC4062i));
            int iC0 = interfaceC4062i.c0(i10);
            if (fE == 0.0f) {
                i12 += iC0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iC0 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int c(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i12);
            float fE = G.e(G.d(interfaceC4062i));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC4062i.c0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC4062i.Q(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC4062i interfaceC4062i2 = (InterfaceC4062i) list.get(i13);
            float fE2 = G.e(G.d(interfaceC4062i2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC4062i2.Q(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i13);
            float fE = G.e(G.d(interfaceC4062i));
            int iZ = interfaceC4062i.Z(i10);
            if (fE == 0.0f) {
                i12 += iZ;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iZ / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int e(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i13);
            float fE = G.e(G.d(interfaceC4062i));
            int iA = interfaceC4062i.A(i10);
            if (fE == 0.0f) {
                i12 += iA;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iA / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int f(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i12);
            float fE = G.e(G.d(interfaceC4062i));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC4062i.A(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC4062i.c0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC4062i interfaceC4062i2 = (InterfaceC4062i) list.get(i13);
            float fE2 = G.e(G.d(interfaceC4062i2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC4062i2.c0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i13);
            float fE = G.e(G.d(interfaceC4062i));
            int iQ = interfaceC4062i.Q(i10);
            if (fE == 0.0f) {
                i12 += iQ;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iQ / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int h(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC4062i interfaceC4062i = (InterfaceC4062i) list.get(i12);
            float fE = G.e(G.d(interfaceC4062i));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC4062i.A(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC4062i.Z(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC4062i interfaceC4062i2 = (InterfaceC4062i) list.get(i13);
            float fE2 = G.e(G.d(interfaceC4062i2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC4062i2.Z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
