package If;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractC3942d;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends AbstractC3942d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5442d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1109k[] f5443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f5444c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C1106h c1106h, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((C1109k) list.get(i17)).M() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C1109k c1109k = (C1109k) list.get(i11);
            C1109k c1109k2 = (C1109k) list.get(i12 - 1);
            if (i16 == c1109k.M()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                C1109k c1109k3 = (C1109k) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                c1109k = c1109k3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c1109k.r(i16) == c1109k2.r(i16)) {
                int iMin = Math.min(c1109k.M(), c1109k2.M());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && c1109k.r(i20) == c1109k2.r(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(c1106h) + ((long) 2) + ((long) i19) + 1;
                c1106h.writeInt(-i19);
                c1106h.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c1106h.writeInt(c1109k.r(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((C1109k) list.get(i13)).M()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c1106h.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C1106h c1106h2 = new C1106h();
                    c1106h.writeInt(((int) (c(c1106h2) + jC)) * (-1));
                    a(jC, c1106h2, i21, list, i13, i12, list2);
                    c1106h.U0(c1106h2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((C1109k) list.get(i23 - 1)).r(i16) != ((C1109k) list.get(i23)).r(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(c1106h) + ((long) 2) + ((long) (i22 * 2));
            c1106h.writeInt(i22);
            c1106h.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bR = ((C1109k) list.get(i24)).r(i16);
                if (i24 == i13 || bR != ((C1109k) list.get(i24 - 1)).r(i16)) {
                    c1106h.writeInt(bR & 255);
                }
            }
            C1106h c1106h3 = new C1106h();
            while (i13 < i12) {
                byte bR2 = ((C1109k) list.get(i13)).r(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bR2 != ((C1109k) list.get(i26)).r(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((C1109k) list.get(i13)).M()) {
                    c1106h.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    c1106h.writeInt(((int) (c(c1106h3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, c1106h3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            c1106h.U0(c1106h3);
        }

        static /* synthetic */ void b(a aVar, long j10, C1106h c1106h, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, c1106h, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C1106h c1106h) {
            return c1106h.size() / ((long) 4);
        }

        public final O d(C1109k... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            if (byteStrings.length == 0) {
                return new O(new C1109k[0], new int[]{0, -1}, null);
            }
            List listS0 = AbstractC3952n.S0(byteStrings);
            CollectionsKt.z(listS0);
            int size = listS0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(CollectionsKt.k(listS0, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((C1109k) listS0.get(0)).M() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listS0.size()) {
                C1109k c1109k = (C1109k) listS0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listS0.size()) {
                    C1109k c1109k2 = (C1109k) listS0.get(i15);
                    if (!c1109k2.N(c1109k)) {
                        break;
                    }
                    if (c1109k2.M() == c1109k.M()) {
                        throw new IllegalArgumentException(("duplicate option: " + c1109k2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        listS0.remove(i15);
                        arrayList.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            C1106h c1106h = new C1106h();
            b(this, 0L, c1106h, 0, listS0, 0, 0, arrayList, 53, null);
            int iC = (int) c(c1106h);
            int[] iArr = new int[iC];
            for (int i16 = 0; i16 < iC; i16++) {
                iArr[i16] = c1106h.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            return new O((C1109k[]) objArrCopyOf, iArr, null);
        }
    }

    private O(C1109k[] c1109kArr, int[] iArr) {
        this.f5443b = c1109kArr;
        this.f5444c = iArr;
    }

    public /* synthetic */ O(C1109k[] c1109kArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1109kArr, iArr);
    }

    public static final O q(C1109k... c1109kArr) {
        return f5442d.d(c1109kArr);
    }

    @Override // kotlin.collections.AbstractC3940b
    public int c() {
        return this.f5443b.length;
    }

    @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1109k) {
            return g((C1109k) obj);
        }
        return false;
    }

    public /* bridge */ boolean g(C1109k c1109k) {
        return super.contains(c1109k);
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1109k get(int i10) {
        return this.f5443b[i10];
    }

    public final C1109k[] i() {
        return this.f5443b;
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1109k) {
            return n((C1109k) obj);
        }
        return -1;
    }

    public final int[] k() {
        return this.f5444c;
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1109k) {
            return p((C1109k) obj);
        }
        return -1;
    }

    public /* bridge */ int n(C1109k c1109k) {
        return super.indexOf(c1109k);
    }

    public /* bridge */ int p(C1109k c1109k) {
        return super.lastIndexOf(c1109k);
    }
}
