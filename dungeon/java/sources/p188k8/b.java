package p188k8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(iDataPosition);
            sb2.append(" size=");
            sb2.append(iDataSize);
            super(sb2.toString());
        }
    }

    public static int A(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void B(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + A(parcel, i10));
    }

    public static int C(Parcel parcel) {
        int iU = u(parcel);
        int iA = A(parcel, iU);
        int iN = n(iU);
        int iDataPosition = parcel.dataPosition();
        if (iN != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iU))), parcel);
        }
        int i10 = iA + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    private static void D(Parcel parcel, int i10, int i11) {
        int iA = A(parcel, i10);
        if (iA == i11) {
            return;
        }
        String hexString = Integer.toHexString(iA);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(iA).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(iA);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    private static void E(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    public static boolean[] a(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iA);
        return zArrCreateBooleanArray;
    }

    public static Bundle b(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iA);
        return bundle;
    }

    public static byte[] c(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iA);
        return bArrCreateByteArray;
    }

    public static float[] d(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iA);
        return fArrCreateFloatArray;
    }

    public static int[] e(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iA);
        return iArrCreateIntArray;
    }

    public static ArrayList f(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iA);
        return arrayList;
    }

    public static Parcelable g(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iA);
        return parcelable;
    }

    public static String h(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iA);
        return string;
    }

    public static String[] i(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iA);
        return strArrCreateStringArray;
    }

    public static ArrayList j(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateStringArrayList;
    }

    public static Object[] k(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return objArrCreateTypedArray;
    }

    public static ArrayList l(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateTypedArrayList;
    }

    public static void m(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    public static int n(int i10) {
        return (char) i10;
    }

    public static boolean o(Parcel parcel, int i10) {
        D(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean p(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        if (iA == 0) {
            return null;
        }
        E(parcel, i10, iA, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double q(Parcel parcel, int i10) {
        D(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double r(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        if (iA == 0) {
            return null;
        }
        E(parcel, i10, iA, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float s(Parcel parcel, int i10) {
        D(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float t(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        if (iA == 0) {
            return null;
        }
        E(parcel, i10, iA, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int u(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder v(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iA);
        return strongBinder;
    }

    public static int w(Parcel parcel, int i10) {
        D(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer x(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        if (iA == 0) {
            return null;
        }
        E(parcel, i10, iA, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long y(Parcel parcel, int i10) {
        D(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long z(Parcel parcel, int i10) {
        int iA = A(parcel, i10);
        if (iA == 0) {
            return null;
        }
        E(parcel, i10, iA, 8);
        return Long.valueOf(parcel.readLong());
    }
}
