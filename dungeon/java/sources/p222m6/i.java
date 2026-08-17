package p222m6;

import Ad.B;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f49152a = new i();

    private i() {
    }

    private final boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable iterableT = AbstractC3952n.T(bArr);
        if ((iterableT instanceof Collection) && ((Collection) iterableT).isEmpty()) {
            return true;
        }
        Iterator it = iterableT.iterator();
        while (it.hasNext()) {
            int iNextInt = ((K) it).nextInt();
            if (((byte) str.charAt(iNextInt)) != bArr[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    public static final int b(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        i iVar = f49152a;
        return (iVar.e(stream) << 8) | iVar.e(stream);
    }

    private final String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append((char) (B.g(b10) & 65535));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int d(InputStream inputStream) {
        int iE = e(inputStream);
        int iE2 = e(inputStream);
        return (e(inputStream) << 24) | (e(inputStream) << 16) | (iE2 << 8) | iE;
    }

    private final int e(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    public static final Pair f(InputStream stream) {
        Pair pairG;
        Intrinsics.checkNotNullParameter(stream, "stream");
        byte[] bArr = new byte[4];
        try {
            try {
                stream.read(bArr);
                i iVar = f49152a;
                if (iVar.a(bArr, "RIFF")) {
                    iVar.d(stream);
                    stream.read(bArr);
                    if (iVar.a(bArr, "WEBP")) {
                        stream.read(bArr);
                        String strC = iVar.c(bArr);
                        int iHashCode = strC.hashCode();
                        if (iHashCode == 2640674) {
                            if (strC.equals("VP8 ")) {
                                pairG = iVar.g(stream);
                                return pairG;
                            }
                            return null;
                        }
                        if (iHashCode == 2640718) {
                            if (!strC.equals("VP8L")) {
                                return null;
                            }
                            pairG = iVar.h(stream);
                            return pairG;
                        }
                        if (iHashCode != 2640730 || !strC.equals("VP8X")) {
                            return null;
                        }
                        pairG = iVar.i(stream);
                        try {
                            return pairG;
                        } catch (IOException e10) {
                            return pairG;
                        }
                    }
                }
                try {
                    return null;
                } catch (IOException e11) {
                    return null;
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        } finally {
            try {
                stream.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        }
    }

    private final Pair g(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int iE = e(inputStream);
        int iE2 = e(inputStream);
        int iE3 = e(inputStream);
        if (iE == 157 && iE2 == 1 && iE3 == 42) {
            return new Pair(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    private final Pair h(InputStream inputStream) throws IOException {
        d(inputStream);
        if (e(inputStream) != 47) {
            return null;
        }
        int i10 = inputStream.read() & 255;
        int i11 = inputStream.read();
        return new Pair(Integer.valueOf((i10 | ((i11 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i11 & 192) >> 6)) + 1));
    }

    private final Pair i(InputStream inputStream) throws IOException {
        inputStream.skip(8L);
        return new Pair(Integer.valueOf(j(inputStream) + 1), Integer.valueOf(j(inputStream) + 1));
    }

    private final int j(InputStream inputStream) {
        return (e(inputStream) << 16) | (e(inputStream) << 8) | e(inputStream);
    }
}
