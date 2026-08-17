package P2;

import R1.z;
import U1.F;
import java.util.ArrayList;
import java.util.List;
import p380v2.I;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final B9.r f8751d = B9.r.d(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final B9.r f8752e = B9.r.d('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8753a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8754b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8755c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8758c;

        public a(int i10, long j10, int i11) {
            this.f8756a = i10;
            this.f8757b = j10;
            this.f8758c = i11;
        }
    }

    private void a(InterfaceC4254q interfaceC4254q, I i10) {
        F f10 = new F(8);
        interfaceC4254q.readFully(f10.f(), 0, 8);
        this.f8755c = f10.y() + 8;
        if (f10.u() != 1397048916) {
            i10.f55969a = 0L;
        } else {
            i10.f55969a = interfaceC4254q.getPosition() - ((long) (this.f8755c - 12));
            this.f8754b = 2;
        }
    }

    private static int b(String str) throws z {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw z.a("Invalid SEF name", null);
        }
    }

    private void d(InterfaceC4254q interfaceC4254q, I i10) {
        long length = interfaceC4254q.getLength();
        int i11 = this.f8755c - 20;
        F f10 = new F(i11);
        interfaceC4254q.readFully(f10.f(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            f10.b0(2);
            short sA = f10.A();
            if (sA == 2192 || sA == 2816 || sA == 2817 || sA == 2819 || sA == 2820) {
                this.f8753a.add(new a(sA, (length - ((long) this.f8755c)) - ((long) f10.y()), f10.y()));
            } else {
                f10.b0(8);
            }
        }
        if (this.f8753a.isEmpty()) {
            i10.f55969a = 0L;
        } else {
            this.f8754b = 3;
            i10.f55969a = ((a) this.f8753a.get(0)).f8757b;
        }
    }

    private void e(InterfaceC4254q interfaceC4254q, List list) throws z {
        long position = interfaceC4254q.getPosition();
        int length = (int) ((interfaceC4254q.getLength() - interfaceC4254q.getPosition()) - ((long) this.f8755c));
        F f10 = new F(length);
        interfaceC4254q.readFully(f10.f(), 0, length);
        for (int i10 = 0; i10 < this.f8753a.size(); i10++) {
            a aVar = (a) this.f8753a.get(i10);
            f10.a0((int) (aVar.f8757b - position));
            f10.b0(4);
            int iY = f10.y();
            int iB = b(f10.I(iY));
            int i11 = aVar.f8758c - (iY + 8);
            if (iB == 2192) {
                list.add(f(f10, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static K2.c f(F f10, int i10) throws z {
        ArrayList arrayList = new ArrayList();
        List listF = f8752e.f(f10.I(i10));
        for (int i11 = 0; i11 < listF.size(); i11++) {
            List listF2 = f8751d.f((CharSequence) listF.get(i11));
            if (listF2.size() != 3) {
                throw z.a(null, null);
            }
            try {
                arrayList.add(new K2.c.a(Long.parseLong((String) listF2.get(0)), Long.parseLong((String) listF2.get(1)), 1 << (Integer.parseInt((String) listF2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw z.a(null, e10);
            }
        }
        return new K2.c(arrayList);
    }

    public int c(InterfaceC4254q interfaceC4254q, I i10, List list) throws z {
        int i11 = this.f8754b;
        long j10 = 0;
        if (i11 == 0) {
            long length = interfaceC4254q.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i10.f55969a = j10;
            this.f8754b = 1;
        } else if (i11 == 1) {
            a(interfaceC4254q, i10);
        } else if (i11 == 2) {
            d(interfaceC4254q, i10);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC4254q, list);
            i10.f55969a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f8753a.clear();
        this.f8754b = 0;
    }
}
